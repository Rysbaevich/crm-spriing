package kg.megacom.crmtest.service;

import kg.megacom.crmtest.model.dto.MentorDto;
import kg.megacom.crmtest.model.request.MentorRequest;
import org.springframework.stereotype.Service;

@Service
public interface MentorService {
    MentorDto create(MentorRequest request);
}
