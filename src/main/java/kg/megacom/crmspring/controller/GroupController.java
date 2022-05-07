package kg.megacom.crmspring.controller;

import kg.megacom.crmspring.model.request.CreateGroupRequest;
import kg.megacom.crmspring.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/group")
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody CreateGroupRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(groupService.create(request));
    }

    @GetMapping("/get/{id}")
    ResponseEntity<?> findByGroupId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(groupService.getByGroupId(id));
    }
}
