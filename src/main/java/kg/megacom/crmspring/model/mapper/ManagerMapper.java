package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.ManagerDto;
import kg.megacom.crmspring.model.entity.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ManagerMapper extends BaseMapper<Manager, ManagerDto>{
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);
}
