package kg.megacom.crmtest.model.mapper;

import kg.megacom.crmtest.model.dto.CourseFormatDto;
import kg.megacom.crmtest.model.entity.CourseFormat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseFormatMapper extends BaseMapper<CourseFormat, CourseFormatDto> {
    CourseFormatMapper INSTANCE = Mappers.getMapper(CourseFormatMapper.class);
}
