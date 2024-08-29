package ci.digitalacademy.monetab.service.dto;


import ci.digitalacademy.monetab.models.FicheNote;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
public class TeacherDTO extends PersonDTO{

    private Boolean vaccant;

    private String matiereEnseigne;

    private String sujetProchainCours;

    private String matiere;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    private Set<FicheNote> ficheNotes;
}
