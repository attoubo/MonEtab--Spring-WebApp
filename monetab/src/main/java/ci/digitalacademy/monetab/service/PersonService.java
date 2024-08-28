package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.Person;
import ci.digitalacademy.monetab.models.User;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);
    Person update(Person user);
    Optional<Person> findOne( Long id);
    List<Person> findAll();
    void deleteById(Long id);


}
