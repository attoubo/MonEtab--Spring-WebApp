package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showUserList(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/list";
    }

    @GetMapping("/add")
    public String showAddUserForm(Model model) {
        log.debug("Request for showing Add user form");
        model.addAttribute("user", new User());
        return "users/forms";
    }


    @PostMapping
    public String saveUser(User user){
        log.debug("Request for saving a Student : {}", user);
        if (user.getId() == null) {
            user.setCreationDate(Instant.now());
        }

        if (user.getAddress() != null && user.getAddress().getCity() != null) {
            log.debug("Saving user with address: {}", user.getAddress().getCity());
        } else {
            user.setAddress(null);
            log.debug("Saving user with null address");
        }
        userService.save(user);
        return "redirect:/users";

    }

    @GetMapping("/update/{id}")
    public String showUpdateUserForm(Model model, @PathVariable Long id){
        log.debug("Request for showing update user form");
        Optional<User> user = userService.findOne(id);

        if (user.isPresent()) {
            log.info("User found: {}", user);
            model.addAttribute("user", user.get());
            return "/users/forms";
        } else {
            log.warn("User with ID {} not found", id);
            return "redirect:/users";
        }
    }

}
