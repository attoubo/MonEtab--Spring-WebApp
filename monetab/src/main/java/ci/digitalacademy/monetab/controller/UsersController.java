package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.service.UserService;
import ci.digitalacademy.monetab.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        List<UserDTO> users = userService.findAll();
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
    public String saveUser(UserDTO userDTO,  BindingResult result){
        log.debug("Request for saving a Student : {}", userDTO);
        if (userDTO.getId() == null) {
            userDTO.setCreationDate(Instant.now());
        }

        if (result.hasErrors()) {
            return "/users/add";
        }
        userService.save(userDTO);
        return "redirect:/users";

    }

    @GetMapping("/update/{id}")
    public String showUpdateUserForm(Model model, @PathVariable Long id){
        log.debug("Request for showing update user form");
        Optional<UserDTO> user = userService.findOne(id);

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
