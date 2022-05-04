package kg.megacom.crmtest.service.impl;

import kg.megacom.crmtest.model.dto.ManagerDto;
import kg.megacom.crmtest.model.entity.Manager;
import kg.megacom.crmtest.model.mapper.ManagerMapper;
import kg.megacom.crmtest.model.request.ManagerRequest;
import kg.megacom.crmtest.repository.ManagerRepository;
import kg.megacom.crmtest.service.ManagerService;
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
    public ManagerDto create(ManagerRequest request) {
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
