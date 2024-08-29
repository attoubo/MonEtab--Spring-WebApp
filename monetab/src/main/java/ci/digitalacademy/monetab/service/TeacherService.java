package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.service.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    TeacherDTO save(TeacherDTO teacher);
    TeacherDTO update(TeacherDTO teacher);
    Optional<TeacherDTO> findOne(Long id);
    List<TeacherDTO> findAll();
    void deleteById(Long id);


}
