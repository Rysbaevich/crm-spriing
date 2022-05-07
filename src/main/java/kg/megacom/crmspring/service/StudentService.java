package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.StudentDto;
import kg.megacom.crmspring.model.request.CreateRegisterStudentsRequest;
import kg.megacom.crmspring.model.request.CreateStudentRequest;
import kg.megacom.crmspring.model.response.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentDto create(CreateStudentRequest request);

    MessageResponse register(CreateRegisterStudentsRequest request);
}
