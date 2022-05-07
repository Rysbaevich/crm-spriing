package kg.megacom.crmspring.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, insertable = false)
    Long id;

    @Column(name = "date_created", updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
    LocalDateTime dateCreated;

    @Column(name = "date_updated", columnDefinition = "TIMESTAMP")
    LocalDateTime dateUpdated;

    @PrePersist
    public void onCreate(){
        this.dateCreated = LocalDateTime.now();
    }
    @PreUpdate
    public void onUpdate() {
        this.dateUpdated = LocalDateTime.now();
    }
}

