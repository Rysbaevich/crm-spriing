package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.GroupDto;
import kg.megacom.crmspring.model.entity.Group;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GroupMapper extends BaseMapper<Group, GroupDto> {
    GroupMapper INSTANCE = Mappers.getMapper(GroupMapper.class);
}
