package kg.megacom.crmtest.controller;

import kg.megacom.crmtest.model.request.CourseRequest;
import kg.megacom.crmtest.service.CourseService;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/v1/course")
public class CourseController {

    @NonNull CourseService courseService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CourseRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(courseService.create(request));
    }
}