package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.model.dto.CourseDto;
import kg.megacom.crmspring.model.entity.Course;
import kg.megacom.crmspring.model.mapper.CourseMapper;
import kg.megacom.crmspring.model.request.CreateCourseRequest;
import kg.megacom.crmspring.repository.CourseRepository;
import kg.megacom.crmspring.service.CourseFormatService;
import kg.megacom.crmspring.service.CourseService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseServiceImpl implements CourseService {

    @NonNull CourseFormatService courseFormatService;
    @NonNull CourseRepository courseRepository;

    @Override
    public CourseDto create(CreateCourseRequest request) {
        Course course = Course
                .builder()
                .name(request.getName())
                .price(request.getPrice())
                .courseFormat(((CourseFormatServiceImpl) courseFormatService).getByFormat(request.getCourseFormat()))
                .build();

        return CourseMapper.INSTANCE.toDto(courseRepository.save(course));
    }

    Course getById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Mentor by id " + id + " not found!"));
    }
}
