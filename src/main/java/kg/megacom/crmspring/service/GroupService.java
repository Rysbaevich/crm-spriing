package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.GroupDto;
import kg.megacom.crmspring.model.request.CreateGroupRequest;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    GroupDto create(CreateGroupRequest request);

    GroupDto getByGroupId(Long id);
}
