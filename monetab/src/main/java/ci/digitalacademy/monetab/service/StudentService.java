package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.service.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentDTO save(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    Optional<StudentDTO> findOne(Long id);
    List<StudentDTO> findAll();
    void deleteById(Long id);


}
