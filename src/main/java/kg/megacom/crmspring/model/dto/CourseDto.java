package kg.megacom.crmspring.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CourseDto {
    Long id;
    @JsonIgnore
    LocalDateTime dateCreated;
    @JsonIgnore
    LocalDateTime dateUpdated;

    String name;
    BigDecimal price;
    CourseFormatDto courseFormat;
}
