package kg.megacom.crmtest.service;

import kg.megacom.crmtest.model.dto.CourseFormatDto;
import kg.megacom.crmtest.model.entity.CourseFormat;
import org.springframework.stereotype.Service;

@Service
public interface CourseFormatService {
    CourseFormatDto create(CourseFormatDto request);

    CourseFormat getByFormat(String format);
}
