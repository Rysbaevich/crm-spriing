package kg.megacom.crmtest.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_mentors")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mentor extends BaseEntity {
    String firstName;
    String lastName;
    String phoneNumber;

    @Email
    String email;

    LocalDate dob;
    BigDecimal salary;
}
