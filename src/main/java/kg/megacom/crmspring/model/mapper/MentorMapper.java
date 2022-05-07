package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.MentorDto;
import kg.megacom.crmspring.model.entity.Mentor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MentorMapper extends BaseMapper<Mentor, MentorDto> {
    MentorMapper INSTANCE = Mappers.getMapper(MentorMapper.class);
}
