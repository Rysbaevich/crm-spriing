package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.request.CreateManagerRequest;
import kg.megacom.crmspring.service.ManagerService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/v1/manager")
public class ManagerController {
    @NonNull ManagerService managerService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid CreateManagerRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(managerService.create(request));
    }
}
