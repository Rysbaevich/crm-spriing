package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.model.dto.MentorDto;
import kg.megacom.crmspring.model.entity.Mentor;
import kg.megacom.crmspring.model.mapper.MentorMapper;
import kg.megacom.crmspring.model.request.CreateMentorRequest;
import kg.megacom.crmspring.repository.MentorRepository;
import kg.megacom.crmspring.service.MentorService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MentorServiceImpl implements MentorService {

    @NonNull MentorRepository mentorRepository;

    @Override
    public MentorDto create(CreateMentorRequest request) {
        Mentor mentor = Mentor
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dob(request.getDob())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .salary(request.getSalary())
                .build();

        return MentorMapper.INSTANCE.toDto(mentorRepository.save(mentor));
    }

    Mentor getById(Long id) {
        return mentorRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Mentor by id " + id + " not found!"));
    }
}
