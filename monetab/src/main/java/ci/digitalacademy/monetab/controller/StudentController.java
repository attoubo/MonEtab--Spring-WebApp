package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.service.StudentService;
import ci.digitalacademy.monetab.service.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String showStudentList(Model model) {
        List<StudentDTO> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/list";
    }

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        log.debug("Request for showing Add student form");
        model.addAttribute("student", new Student());
        return "students/forms";
    }

    @GetMapping("/update/{id}")
    public String showUpdateStudentForm(Model model, @PathVariable Long id) {
        log.debug("Request for showing update student form");

        Optional<StudentDTO> student = studentService.findOne(id);
        if (student.isPresent()) {
            log.info("Student found: {}", student.get());
            model.addAttribute("student", student.get());
            return "/students/forms";

        } else {
            log.warn("Student with ID {} not found", id);
            return "redirect:/students";
        }
    }

    @PostMapping
    public String saveStudent(StudentDTO studentDTO, BindingResult result){
        log.debug("Request for saving a Student : {}", studentDTO);
        if (result.hasErrors()) {
            return "/teachers/add";
        }
        studentService.save(studentDTO);
        return "redirect:/students";

    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            studentService.deleteById(id);
            redirectAttributes.addFlashAttribute("message", "Eleve supprimé avec succès.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Erreur lors de la suppression de l'eleve.");
        }
        return "redirect:/students";
    }


}

