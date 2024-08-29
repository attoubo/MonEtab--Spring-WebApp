package ci.digitalacademy.monetab.service.dto;


import ci.digitalacademy.monetab.models.Address;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UserDTO {


    private Long id;

    private String pseudo;

    private String password;

    private Instant creationDate;

    //    @JoinColumn(name = "id_etrangere")
//    @OneToOne
    private Address address;

}
