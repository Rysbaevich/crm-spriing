package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.model.dto.ManagerDto;
import kg.megacom.crmspring.model.entity.Manager;
import kg.megacom.crmspring.model.mapper.ManagerMapper;
import kg.megacom.crmspring.model.request.CreateManagerRequest;
import kg.megacom.crmspring.repository.ManagerRepository;
import kg.megacom.crmspring.service.ManagerService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManagerServiceImpl implements ManagerService {

    @NonNull ManagerRepository managerRepository;
    @Override
    public ManagerDto create(CreateManagerRequest request) {
        Manager manager = Manager
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dob(request.getDob())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .salary(request.getSalary())
                .build();

        return ManagerMapper.INSTANCE.toDto(managerRepository.save(manager));
    }
}
