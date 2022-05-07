package kg.megacom.crmspring.service;

import kg.megacom.crmspring.model.dto.MentorDto;
import kg.megacom.crmspring.model.request.CreateMentorRequest;
import org.springframework.stereotype.Service;

@Service
public interface MentorService {
    MentorDto create(CreateMentorRequest request);
}
