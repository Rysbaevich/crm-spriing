package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.CourseDto;
import kg.megacom.crmspring.model.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper extends BaseMapper<Course, CourseDto> {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
}
