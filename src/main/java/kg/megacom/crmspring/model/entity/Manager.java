package kg.megacom.crmspring.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
@Table(name = "tb_managers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Manager extends BaseEntity {
    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "phone_number", nullable = false)
    String phoneNumber;

    @Email
    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "dob", nullable = false)
    LocalDate dob;

    @Column(name = "salary", nullable = false)
    BigDecimal salary;
}
