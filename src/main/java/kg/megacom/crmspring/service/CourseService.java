package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.CourseDto;
import kg.megacom.crmspring.model.request.CreateCourseRequest;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    CourseDto create(CreateCourseRequest request);
}
