package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
