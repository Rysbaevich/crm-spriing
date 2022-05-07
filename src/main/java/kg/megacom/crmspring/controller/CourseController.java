package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.request.CreateCourseRequest;
import kg.megacom.crmspring.service.CourseService;
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
    public ResponseEntity<?> create(@RequestBody CreateCourseRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(courseService.create(request));
    }
}
