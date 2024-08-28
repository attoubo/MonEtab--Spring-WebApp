package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ficheNote")
public class FicheNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note", unique = true, nullable = false)
    private String note;

    @Column(name = "date_note", unique = true, nullable = false)
    private Instant annee;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Override
    public String toString() {
        return "FicheNote{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", annee=" + annee +
//                ", teacher=" + getTeacher() +
                '}';
    }
}
