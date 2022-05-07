package kg.megacom.crmspring.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;
@Getter
@Setter
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateGroupRequest {
    String groupName;
    LocalTime groupTime;
    Long mentorId;
    Long courseId;
}
