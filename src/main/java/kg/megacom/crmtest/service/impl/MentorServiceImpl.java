package kg.megacom.crmtest.service.impl;

import kg.megacom.crmtest.model.dto.MentorDto;
import kg.megacom.crmtest.model.entity.Mentor;
import kg.megacom.crmtest.model.mapper.MentorMapper;
import kg.megacom.crmtest.model.request.MentorRequest;
import kg.megacom.crmtest.repository.MentorRepository;
import kg.megacom.crmtest.service.MentorService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MentorServiceImpl implements MentorService {

    @NonNull MentorRepository mentorRepository;

    @Override
    public MentorDto create(MentorRequest request) {
        Mentor mentor = Mentor
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dob(request.getDob())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .salary(request.getSalary())
                .build();

        return MentorMapper.INSTANCE.toDto(mentorRepository.save(mentor));
    }
}
