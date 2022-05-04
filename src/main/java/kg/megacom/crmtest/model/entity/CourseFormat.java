package kg.megacom.crmtest.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_course_formats")
public class CourseFormat extends BaseEntity {
    String format;
    int courseDurationWeeks;
    LocalTime lessonDuration;
    int lessonPerWeek;
    boolean isOnline;
}
