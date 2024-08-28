package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.FicheNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheNoteRepository extends JpaRepository<FicheNote, Long> {
}
