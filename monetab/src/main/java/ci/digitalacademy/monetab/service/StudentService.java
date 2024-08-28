package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);
    Student update(Student student);
    Optional<Student> findOne(Long id);
    List<Student> findAll();
    void deleteById(Long id);


}
