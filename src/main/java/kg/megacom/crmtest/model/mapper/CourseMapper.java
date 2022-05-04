package kg.megacom.crmtest.model.mapper;

import kg.megacom.crmtest.model.dto.CourseDto;
import kg.megacom.crmtest.model.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper extends BaseMapper<Course, CourseDto> {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
}
