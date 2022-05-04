package kg.megacom.crmtest.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MentorDto {
    Long id;
    @JsonIgnore
    LocalDateTime dateCreated;
    @JsonIgnore
    LocalDateTime dateUpdated;

    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    LocalDate dob;
    BigDecimal salary;
}
