package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.service.UserService;
import ci.digitalacademy.monetab.service.dto.UserDTO;
import ci.digitalacademy.monetab.service.mapper.TeacherMapper;
import ci.digitalacademy.monetab.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Saving User: {}", userDTO);

        User user = UserMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return UserMapper.toDto(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return findOne(userDTO.getId()).map(existingUser-> {
            existingUser.setPseudo(userDTO.getPseudo());
            existingUser.setPassword(userDTO.getPassword());
            existingUser.setCreationDate(userDTO.getCreationDate());
            return save(userDTO);
        }).orElseThrow(()-> new IllegalArgumentException());
    }

//    @Override
//    public User update(User user) {
//        log.debug("Updating user{}", user);
////        return userRepository.findById(user.getId())
////                .map(existingUser -> {
////                    existingUser.setPassword(user.getPassword());
////                    existingUser.setPassword(user.getPseudo());
////                    return existingUser;
////                }).map(existingUser -> {
////                    return save(existingUser);
////                }).orElseThrow(()-> new IllegalArgumentException());
//
//
//        Optional<User> optionalUser = userRepository.findById(user.getId());
//
//        if (optionalUser.isPresent()){
//            User userUpdate = optionalUser.get();
//            userUpdate.setPseudo(user.getPseudo());
//            userUpdate.setPassword(user.getPassword());
//
//            return userRepository.save(userUpdate);
//        } else {
//            throw new IllegalArgumentException();
//        }
////        return user;
//    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(user -> {
            return UserMapper.toDto(user);
        });
    }

    @Override
    public List<UserDTO> findAll() {
//        log.debug("Saving user: {}", );
        return userRepository.findAll().stream().map(user -> {
            return UserMapper.toDto(user);
        }).toList();

    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
