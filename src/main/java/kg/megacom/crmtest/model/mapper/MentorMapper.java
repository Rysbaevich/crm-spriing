package kg.megacom.crmtest.model.mapper;

import kg.megacom.crmtest.model.dto.MentorDto;
import kg.megacom.crmtest.model.entity.Mentor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MentorMapper extends BaseMapper<Mentor, MentorDto> {
    MentorMapper INSTANCE = Mappers.getMapper(MentorMapper.class);
}
