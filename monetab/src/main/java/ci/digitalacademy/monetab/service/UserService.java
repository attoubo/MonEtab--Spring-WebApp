package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);
    User update(User user);
    Optional<User> findOne( Long id);
    List<User> findAll();
    void deleteById(Long id);


}
