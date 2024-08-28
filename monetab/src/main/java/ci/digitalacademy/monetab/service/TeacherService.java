package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    Optional<Teacher> findOne(Long id);
    List<Teacher> findAll();
    void deleteById(Long id);


}
