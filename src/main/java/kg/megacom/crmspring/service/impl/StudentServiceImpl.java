package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.exceptions.StudentRegistrationException;
import kg.megacom.crmspring.model.dto.StudentDto;
import kg.megacom.crmspring.model.entity.Group;
import kg.megacom.crmspring.model.entity.Student;
import kg.megacom.crmspring.model.mapper.StudentMapper;
import kg.megacom.crmspring.model.request.CreateRegisterStudentsRequest;
import kg.megacom.crmspring.model.request.CreateStudentRequest;
import kg.megacom.crmspring.model.response.MessageResponse;
import kg.megacom.crmspring.repository.StudentRepository;
import kg.megacom.crmspring.service.GroupService;
import kg.megacom.crmspring.service.StudentService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @NonNull StudentRepository studentRepository;
    @NonNull GroupService groupService;

    @Override
    public StudentDto create(CreateStudentRequest request) {
        return StudentMapper.INSTANCE.toDto(studentRepository.save(Student
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dob(request.getDob())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .build()));
    }

    @Override
    public MessageResponse register(CreateRegisterStudentsRequest request) {

        Group group = ((GroupServiceImpl)groupService).getById(request.getGroupId());
        int capacity = group.getStudents().size();

        Student student = studentRepository.findById(request.getStudentId()).orElseThrow(
                () -> new EntityNotFoundException("Group by id=" + request.getStudentId() + " not found."));

        if (capacity >= 25) {
            throw new StudentRegistrationException("Group is full! Students in group must not be more than 25");
        }

        group.getStudents().add(student);

        ((GroupServiceImpl) groupService).save(group);

        return MessageResponse.sendMessage("Registration successful");
    }
}
