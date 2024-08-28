package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "Student")
@ToString
@DiscriminatorValue(value = "student")
public class Student extends Person {

    @Column(name = "matricule", unique = true, nullable = false)
    private String matricule;

    @Column(name = "classe", nullable = false)
    private String classe;

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                '}';
    }


}
