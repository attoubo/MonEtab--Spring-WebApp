package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "teacher")
@ToString
@DiscriminatorValue("teacher")
public class Teacher extends Person {

    @Column(name = "vaccant", nullable = false)
    private Boolean vaccant;

    @Column(name = "matiereEnseigne", nullable = false)
    private String matiereEnseigne;

    @Column(name = "sujetProchainCours", nullable = false)
    private String sujetProchainCours;

    @Column(name = "matiere", nullable = false)
    private String matiere;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    private Set<FicheNote> ficheNotes;

}
