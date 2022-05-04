package kg.megacom.crmtest.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManagerRequest {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    LocalDate dob;
    BigDecimal salary;
}
