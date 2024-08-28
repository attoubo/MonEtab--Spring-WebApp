package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.service.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@ToString
@Service
@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public Teacher save(Teacher teacher) {
        log.debug("Saving teacher: {}", teacher);
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public Optional<Teacher> findOne(Long id) {
        return teacherRepository.findById(id);
    }


    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {;
        teacherRepository.deleteById(id);
    }


}
