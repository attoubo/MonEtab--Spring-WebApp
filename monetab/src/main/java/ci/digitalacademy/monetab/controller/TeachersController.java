package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.service.TeacherService;
import ci.digitalacademy.monetab.service.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/teachers")
public class TeachersController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String showTeacherList(Model model){
        List<TeacherDTO> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/list";
    }

    @GetMapping("/add")
    public String showAddTeacherForm(Model model) {
        log.debug("Request for showing Add teacher form");
        model.addAttribute("teacher", new Teacher());
        return "teachers/forms";
    }

    @GetMapping("/update/{id}")
    public String showUpdateTeacherForm(Model model, @PathVariable Long id){
        log.debug("Request for showing update teacher form");

        Optional<TeacherDTO> teacher = teacherService.findOne(id);
        if (teacher.isPresent()) {
            log.info("Teacher found: {}", teacher.get().getDateNaissance());
            System.out.println(teacher);
            model.addAttribute("teacher", teacher.get());
            return "/teachers/forms";

        } else {
            log.warn("Teacher with ID {} not found", id);
            return "redirect:/teachers";
        }

    }



    @PostMapping
    public String saveTeacher(TeacherDTO teacherDTO, BindingResult result){
        log.debug("Request for saving a Teacher : {}", teacherDTO);

        if (result.hasErrors()) {
            return "/teachers/add";
        }
        teacherService.save(teacherDTO);
        return "redirect:/teachers";

    }


    @PostMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            teacherService.deleteById(id);
            redirectAttributes.addFlashAttribute("message", "Professeur supprimé avec succès.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Erreur lors de la suppression du professeur.");
        }
        return "redirect:/teachers";
    }



}
