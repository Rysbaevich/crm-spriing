package kg.megacom.crmtest.model.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_students")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends BaseEntity {
    String firstName;
    String lastName;
    String phoneNumber;

    @Column(unique = true)
    String email;
    LocalDate dob;

    @ManyToOne
    @JoinColumn(name = "group_id")
    Group group;
}
