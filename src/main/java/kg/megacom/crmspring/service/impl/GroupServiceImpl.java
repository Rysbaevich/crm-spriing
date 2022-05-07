package kg.megacom.crmspring.service.impl;

import kg.megacom.crmspring.model.dto.GroupDto;
import kg.megacom.crmspring.model.entity.Group;
import kg.megacom.crmspring.model.mapper.GroupMapper;
import kg.megacom.crmspring.model.request.CreateGroupRequest;
import kg.megacom.crmspring.repository.GroupRepository;
import kg.megacom.crmspring.service.CourseService;
import kg.megacom.crmspring.service.GroupService;
import kg.megacom.crmspring.service.MentorService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroupServiceImpl implements GroupService {

    @NonNull CourseService courseService;
    @NonNull MentorService mentorService;
    @NonNull GroupRepository repository;


    @Override
    public GroupDto create(CreateGroupRequest request) {
        Group group = Group
                .builder()
                .groupName(request.getGroupName())
                .groupTime(request.getGroupTime())
                .course(((CourseServiceImpl)courseService).getById(request.getCourseId()))
                .mentor(((MentorServiceImpl)mentorService).getById(request.getMentorId()))
                .build();

        return GroupMapper.INSTANCE.toDto(repository.save(group));
    }

    public GroupDto getByGroupId(Long id) {
        return GroupMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Group by id=" + id + " not found.")));
    }

    Group getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Group by id=" + id + " not found."));
    }

    void save(Group group) {
        repository.save(group);
    }
}
