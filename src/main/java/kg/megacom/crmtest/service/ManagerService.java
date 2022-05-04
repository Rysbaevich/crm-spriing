package kg.megacom.crmtest.service;

import kg.megacom.crmtest.model.dto.ManagerDto;
import kg.megacom.crmtest.model.request.ManagerRequest;
import org.springframework.stereotype.Service;

@Service
public interface ManagerService {
    ManagerDto create(ManagerRequest request);
}
