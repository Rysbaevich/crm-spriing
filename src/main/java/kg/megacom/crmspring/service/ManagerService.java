package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.ManagerDto;
import kg.megacom.crmspring.model.request.CreateManagerRequest;
import org.springframework.stereotype.Service;

@Service
public interface ManagerService {
    ManagerDto create(CreateManagerRequest request);
}
