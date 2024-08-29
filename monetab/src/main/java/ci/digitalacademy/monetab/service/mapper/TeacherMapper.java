package ci.digitalacademy.monetab.service.mapper;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.service.dto.TeacherDTO;

public class TeacherMapper {
    private TeacherMapper(){}

    public static TeacherDTO toDto(Teacher teacher){
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setNom(teacher.getNom());
        teacherDTO.setPrenom(teacher.getPrenom());
        teacherDTO.setGenre(teacher.getGenre());
        teacherDTO.setEmail(teacher.getEmail());
        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setVaccant(teacher.getVaccant());
        teacherDTO.setMatiereEnseigne(teacher.getMatiereEnseigne());
        teacherDTO.setSujetProchainCours(teacher.getSujetProchainCours());
        teacherDTO.setDateNaissance(teacher.getDateNaissance());
        teacherDTO.setTelephone(teacher.getTelephone());
        teacherDTO.setVille(teacher.getVille());
        return teacherDTO;
    }

    public static Teacher toEntity(TeacherDTO teacherDTO){
        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getId());
        teacher.setNom(teacherDTO.getNom());
        teacher.setPrenom(teacherDTO.getPrenom());
        teacher.setGenre(teacherDTO.getGenre());
        teacher.setEmail(teacherDTO.getEmail());
        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setVaccant(teacherDTO.getVaccant());
        teacher.setDateNaissance(teacherDTO.getDateNaissance());
        teacher.setTelephone(teacherDTO.getTelephone());
        teacher.setVille(teacherDTO.getVille());
        teacher.setMatiereEnseigne(teacherDTO.getMatiereEnseigne());
        teacher.setSujetProchainCours(teacherDTO.getSujetProchainCours());
        teacher.setFicheNotes(teacherDTO.getFicheNotes());
        return teacher;
    }
}
