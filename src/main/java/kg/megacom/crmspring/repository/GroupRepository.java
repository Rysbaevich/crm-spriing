package kg.megacom.crmspring.repository;

import kg.megacom.crmspring.model.entity.Group;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    Optional<Group> findById( Long id);
}
