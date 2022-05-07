package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.CourseFormatDto;
import kg.megacom.crmspring.model.entity.CourseFormat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseFormatMapper extends BaseMapper<CourseFormat, CourseFormatDto> {
    CourseFormatMapper INSTANCE = Mappers.getMapper(CourseFormatMapper.class);
}
