package kg.megacom.crmtest.model.mapper;

import kg.megacom.crmtest.model.dto.ManagerDto;
import kg.megacom.crmtest.model.entity.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ManagerMapper extends BaseMapper<Manager, ManagerDto>{
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);
}
