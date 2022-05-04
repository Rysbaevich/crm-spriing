package kg.megacom.crmtest.repository;

import kg.megacom.crmtest.model.dto.CourseFormatDto;
import kg.megacom.crmtest.model.entity.CourseFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseFormatRepository extends JpaRepository<CourseFormat, Long> {
    Optional<CourseFormat> findCourseFormatByFormat(String format);
}
