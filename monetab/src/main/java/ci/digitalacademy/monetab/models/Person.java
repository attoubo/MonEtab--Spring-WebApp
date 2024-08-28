package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
@Setter
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "person_type")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String nom;

    @Column(name = "last_name", nullable = false)
    private String prenom;

    @Column(name = "gender", nullable = false)
    private String genre;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telephone", nullable = false, unique = true)
    private String telephone;

    @Column(name = "city", nullable = false, unique = true)
    private String ville;

    @Column(name = "date_naissance", nullable = false)
    private Date dateNaissance;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }


}
