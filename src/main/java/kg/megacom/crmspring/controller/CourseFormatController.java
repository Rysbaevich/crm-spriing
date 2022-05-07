package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.dto.CourseFormatDto;
import kg.megacom.crmspring.service.CourseFormatService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/course-format")
public class CourseFormatController {
    @NonNull CourseFormatService courseFormatService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CourseFormatDto request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(courseFormatService.create(request));
    }
}
