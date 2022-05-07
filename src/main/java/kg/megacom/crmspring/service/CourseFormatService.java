package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.CourseFormatDto;
import org.springframework.stereotype.Service;

@Service
public interface CourseFormatService {
    CourseFormatDto create(CourseFormatDto request);
}
