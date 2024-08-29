package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.service.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDTO save(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
    Optional<UserDTO> findOne( Long id);
    List<UserDTO> findAll();
    void deleteById(Long id);


}
