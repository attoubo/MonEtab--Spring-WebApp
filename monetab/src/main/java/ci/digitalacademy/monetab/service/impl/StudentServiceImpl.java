package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.service.StudentService;
import ci.digitalacademy.monetab.service.TeacherService;
import ci.digitalacademy.monetab.service.dto.StudentDTO;
import ci.digitalacademy.monetab.service.mapper.StudentMapper;
import ci.digitalacademy.monetab.service.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@ToString
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        log.debug("Saving student: {}", studentDTO);

        Student student = StudentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return StudentMapper.toDto(student);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        return findOne(studentDTO.getId()).map(existingStudent->{
            existingStudent.setNom(studentDTO.getNom());
            existingStudent.setPrenom(studentDTO.getPrenom());
            existingStudent.setMatricule(studentDTO.getMatricule());
            existingStudent.setGenre(studentDTO.getGenre());
            existingStudent.setDateNaissance(studentDTO.getDateNaissance());
            existingStudent.setClasse(studentDTO.getClasse());
            existingStudent.setTelephone(studentDTO.getTelephone());
            existingStudent.setVille(studentDTO.getVille());
            return save(studentDTO);
        }).orElseThrow(()->new IllegalArgumentException());    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepository.findById(id).map(student ->{
            return StudentMapper.toDto(student);
        });
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(student -> {
            return StudentMapper.toDto(student);
        }).toList();
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
