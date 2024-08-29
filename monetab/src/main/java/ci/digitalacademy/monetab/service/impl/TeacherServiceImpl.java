package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.service.TeacherService;
import ci.digitalacademy.monetab.service.dto.AddressDTO;
import ci.digitalacademy.monetab.service.dto.TeacherDTO;
import ci.digitalacademy.monetab.service.mapper.AddressMapper;
import ci.digitalacademy.monetab.service.mapper.TeacherMapper;
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
    public TeacherDTO save(TeacherDTO teacherDTO) {
        log.debug("Saving teacher: {}", teacherDTO);

        Teacher teacher = TeacherMapper.toEntity(teacherDTO);
        teacher = teacherRepository.save(teacher);
        return TeacherMapper.toDto(teacher);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        return findOne(teacherDTO.getId()).map(existingTeacher->{
            existingTeacher.setNom(teacherDTO.getNom());
            existingTeacher.setPrenom(teacherDTO.getPrenom());
            existingTeacher.setMatiere(teacherDTO.getMatiere());
            existingTeacher.setDateNaissance(teacherDTO.getDateNaissance());
            existingTeacher.setSujetProchainCours(teacherDTO.getSujetProchainCours());
            return save(teacherDTO);
        }).orElseThrow(()->new IllegalArgumentException());
    }
    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        return teacherRepository.findById(id).map(teacher -> {
            return TeacherMapper.toDto(teacher);
        });
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll().stream().map(teacher -> {
            return TeacherMapper.toDto(teacher);
        }).toList();
    }

    @Override
    public void deleteById(Long id) {;
        teacherRepository.deleteById(id);
    }


}
