package ci.digitalacademy.monetab.service.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
public class PersonDTO {

    private Long id;

    private String nom;

    private String prenom;

    private String genre;

    private String email;

    private String telephone;

    private String ville;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate dateNaissance;

}
