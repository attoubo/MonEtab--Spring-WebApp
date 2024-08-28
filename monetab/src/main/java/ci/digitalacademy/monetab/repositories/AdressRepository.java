package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Address, Long> {
}
