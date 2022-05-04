package kg.megacom.crmtest.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_courses")
public class Course extends BaseEntity {
    String name;
    BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "course_format_id")
    CourseFormat courseFormat;
}
