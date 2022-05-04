package kg.megacom.crmtest.service.impl;

import kg.megacom.crmtest.model.dto.CourseFormatDto;
import kg.megacom.crmtest.model.entity.CourseFormat;
import kg.megacom.crmtest.model.mapper.CourseFormatMapper;
import kg.megacom.crmtest.repository.CourseFormatRepository;
import kg.megacom.crmtest.service.CourseFormatService;
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
                .isOnline(request.isOnline())
                .lessonDuration(request.getLessonDuration())
                .lessonPerWeek(request.getLessonPerWeek())
                .build();
        return CourseFormatMapper.INSTANCE.toDto(courseFormatRepository.save(courseFormat));
    }

    @Override
    public CourseFormat getByFormat(String format) {
        return courseFormatRepository.findCourseFormatByFormat(format)
                .orElseThrow(() -> new EntityNotFoundException("Course format " + format + " not found"));
    }
}
