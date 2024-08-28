package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.service.UserService;
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
    public User save(User user) {
        log.debug("Saving user: {}", user);
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
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
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
//        log.debug("Saving user: {}", );
        return userRepository.findAll();

    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
