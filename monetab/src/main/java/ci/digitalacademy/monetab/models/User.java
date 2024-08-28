package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
//@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pseudo", unique = true, nullable = false)
    private String pseudo;

    @Column(name = "password", unique = true, nullable = false)
    private String password;

    @Column(name = "creation_date", nullable = false)
    private Instant creationDate;


//    @JoinColumn(name = "id_etrangere")
    @OneToOne
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", address=" + (address != null ? address.getCity() : "null") +
                '}';
    }
}
