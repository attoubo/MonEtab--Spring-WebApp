package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Person;
import ci.digitalacademy.monetab.repositories.PersonRepository;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    // Suppression de la dépendance circulaire

    @Override
    public Person save(Person person) {
        // Implémentation du code pour sauvegarder une Person
        return null;
    }

    @Override
    public Person update(Person person) {
        // Implémentation du code pour mettre à jour une Person
        return null;
    }

    @Override
    public Optional<Person> findOne(Long id) {
        // Implémentation du code pour trouver une Person par ID
        return Optional.empty();
    }

    @Override
    public List<Person> findAll() {
        // Implémentation du code pour lister toutes les Person
        return null;
    }

    @Override
    public void deleteById(Long id) {
        // Implémentation du code pour supprimer une Person par ID
    }
}
