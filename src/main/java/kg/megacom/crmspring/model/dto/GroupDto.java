package kg.megacom.crmspring.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GroupDto {
    Long id;
    @JsonIgnore
    LocalDateTime dateCreated;
    @JsonIgnore
    LocalDateTime dateUpdated;

    String groupName;
    LocalTime groupTime;
    MentorDto mentor;
    CourseDto course;

    List<StudentDto> students;
}
