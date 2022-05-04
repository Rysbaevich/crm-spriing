package kg.megacom.crmtest.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class MentorRequest {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    LocalDate dob;
    BigDecimal salary;
}
