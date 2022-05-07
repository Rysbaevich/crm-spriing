package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.request.CreateRegisterStudentsRequest;
import kg.megacom.crmspring.model.request.CreateStudentRequest;
import kg.megacom.crmspring.service.StudentService;
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

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentController {

    @NonNull StudentService studentService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody CreateStudentRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(studentService.create(request));
    }

    @PostMapping("/register")
    ResponseEntity<?> registerStudent(@RequestBody CreateRegisterStudentsRequest request) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentService.register(request));
    }
}
