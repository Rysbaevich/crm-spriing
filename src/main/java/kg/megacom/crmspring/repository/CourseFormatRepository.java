package kg.megacom.crmspring.repository;

import kg.megacom.crmspring.model.entity.CourseFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseFormatRepository extends JpaRepository<CourseFormat, Long> {
    Optional<CourseFormat> findCourseFormatByFormat(String format);
}
