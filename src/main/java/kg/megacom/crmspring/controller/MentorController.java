package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.request.CreateMentorRequest;
import kg.megacom.crmspring.service.MentorService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/mentor")
public class MentorController {

    @NonNull MentorService mentorService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid CreateMentorRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mentorService.create(request));
    }
}
