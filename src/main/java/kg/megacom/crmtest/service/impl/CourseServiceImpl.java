package kg.megacom.crmtest.service.impl;

import kg.megacom.crmtest.model.dto.CourseDto;
import kg.megacom.crmtest.model.entity.Course;
import kg.megacom.crmtest.model.mapper.CourseMapper;
import kg.megacom.crmtest.model.request.CourseRequest;
import kg.megacom.crmtest.repository.CourseRepository;
import kg.megacom.crmtest.service.CourseFormatService;
import kg.megacom.crmtest.service.CourseService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseServiceImpl implements CourseService {

    @NonNull CourseFormatService courseFormatService;
    @NonNull CourseRepository courseRepository;

    @Override
    public CourseDto create(CourseRequest request) {
        Course course = Course
                .builder()
                .name(request.getName())
                .price(request.getPrice())
                .courseFormat(courseFormatService.getByFormat(request.getCourseFormat()))
                .build();

        return CourseMapper.INSTANCE.toDto(courseRepository.save(course));
    }
}
