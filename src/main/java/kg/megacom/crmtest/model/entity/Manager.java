package kg.megacom.crmtest.model.entity;

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
    String firstName;
    String lastName;
    String phoneNumber;

    @Email
    String email;
    LocalDate dob;
    BigDecimal salary;
}
