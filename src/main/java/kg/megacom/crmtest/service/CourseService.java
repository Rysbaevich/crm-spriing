package kg.megacom.crmtest.service;

import kg.megacom.crmtest.model.dto.CourseDto;
import kg.megacom.crmtest.model.entity.Course;
import kg.megacom.crmtest.model.request.CourseRequest;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    CourseDto create(CourseRequest request);
}
