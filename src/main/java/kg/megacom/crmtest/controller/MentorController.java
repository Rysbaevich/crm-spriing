package kg.megacom.crmtest.controller;

import kg.megacom.crmtest.model.request.MentorRequest;
import kg.megacom.crmtest.service.MentorService;
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
    public ResponseEntity<?> create(@RequestBody @Valid MentorRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mentorService.create(request));
    }
}
