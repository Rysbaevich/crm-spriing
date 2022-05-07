package kg.megacom.crmspring.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
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
    @Column(name = "format", nullable = false)
    String format;

    @Column(name = "course_duration_weeks", nullable = false)
    Integer courseDurationWeeks;

    @Column(name = "lesson_duration", nullable = false)
    LocalTime lessonDuration;

    @Column(name = "lesson_per_week", nullable = false)
    Integer lessonPerWeek;

    @Column(name = "is_online")
    Boolean isOnline;
}
