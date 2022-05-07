package kg.megacom.crmspring.model.entity;

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

    @Column(name = "group_name", nullable = false)
    String groupName;

    @Column(name = "group_time", nullable = false)
    LocalTime groupTime;

    @ManyToOne
    @JoinColumn(name = "mentor_id", referencedColumnName = "id")
    Mentor mentor;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    Course course;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_register",
            joinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
    List<Student> students;
}
