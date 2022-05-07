package kg.megacom.crmspring.model.mapper;

import kg.megacom.crmspring.model.dto.StudentDto;
import kg.megacom.crmspring.model.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper extends BaseMapper<Student, StudentDto> {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
}
