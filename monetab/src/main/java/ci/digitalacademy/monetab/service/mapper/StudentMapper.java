package ci.digitalacademy.monetab.service.mapper;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.service.dto.StudentDTO;


public class StudentMapper {

    private StudentMapper(){};

    public static StudentDTO toDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setNom(student.getNom());
        studentDTO.setPrenom(student.getPrenom());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setGenre(student.getGenre());
        studentDTO.setDateNaissance(student.getDateNaissance());
        studentDTO.setClasse(student.getClasse());
        studentDTO.setTelephone(student.getTelephone());
        studentDTO.setVille(student.getVille());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setNom(studentDTO.getNom());
        student.setPrenom(studentDTO.getPrenom());
        student.setEmail(studentDTO.getEmail());
        student.setMatricule(studentDTO.getMatricule());
        student.setGenre(studentDTO.getGenre());
        student.setDateNaissance(studentDTO.getDateNaissance());
        student.setClasse(studentDTO.getClasse());
        student.setTelephone(studentDTO.getTelephone());
        student.setVille(studentDTO.getVille());
        return student;
    }



}
