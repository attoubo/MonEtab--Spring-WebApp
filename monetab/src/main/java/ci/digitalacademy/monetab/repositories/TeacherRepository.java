package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {



}
