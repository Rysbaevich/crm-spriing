package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.model.dto.CourseFormatDto;
import kg.megacom.crmspring.model.entity.CourseFormat;
import kg.megacom.crmspring.model.mapper.CourseFormatMapper;
import kg.megacom.crmspring.repository.CourseFormatRepository;
import kg.megacom.crmspring.service.CourseFormatService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class CourseFormatServiceImpl implements CourseFormatService {

    @NonNull
    private CourseFormatRepository courseFormatRepository;

    @Override
    public CourseFormatDto create(CourseFormatDto request) {
        CourseFormat courseFormat = CourseFormat
                .builder()
                .format(request.getFormat())
                .courseDurationWeeks(request.getCourseDurationWeeks())
                .isOnline(request.getIsOnline())
                .lessonDuration(request.getLessonDuration())
                .lessonPerWeek(request.getLessonPerWeek())
                .build();
        return CourseFormatMapper.INSTANCE.toDto(courseFormatRepository.save(courseFormat));
    }

    CourseFormat getByFormat(String format) {
        return courseFormatRepository.findCourseFormatByFormat(format)
                .orElseThrow(() -> new EntityNotFoundException("Course format " + format + " not found"));
    }
}
