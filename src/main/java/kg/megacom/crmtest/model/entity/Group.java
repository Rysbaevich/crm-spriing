package kg.megacom.crmtest.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_groups")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Group extends BaseEntity {
    String groupName;
    LocalTime groupTime;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    List<Student> students;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    Mentor mentor;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
}
