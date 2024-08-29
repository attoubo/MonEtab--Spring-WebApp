package ci.digitalacademy.monetab.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class StudentDTO extends PersonDTO {

    private String matricule;

    private String classe;

}
