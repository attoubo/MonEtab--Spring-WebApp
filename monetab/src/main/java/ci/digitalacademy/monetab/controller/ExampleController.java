//package ci.digitalacademy.monetab.controller;
//
//import ci.digitalacademy.monetab.models.Teacher;
//import ci.digitalacademy.monetab.services.TeacherService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/teachers")
//@RequiredArgsConstructor
//@Slf4j
//public class TeachersController {
//
//    public final TeacherService teacherService;
//
//
//    @GetMapping
//    public String showTeachersList(Model model){
//        log.debug("Request to show teachers list");
//        List<Teacher> teachers = teacherService.findAll();
//        model.addAttribute("teachers" , teachers);
//
//        return "teachers/list";
//    }
//
//    @PostMapping
//    public String saveTeacher(Teacher teacher){
//        log.debug("Request to save teacher :{}", teacher);
//        teacherService.save(teacher);
//        return "redirect:/teachers";
//    }
//
//    @GetMapping("/{id}")
//    public String showUpdateTeacherForms(Model model, @PathVariable Long id){
//        log.debug("Request to show update teacher forms");
//        Optional<Teacher> teacher = teacherService.findOne(id);
//        if (teacher.isPresent()){
//            model.addAttribute("teacher" , teacher.get());
//            return "teachers/forms";
//        } else {
//            return "redirect:/teachers";
//        }
//    }
//
//
//    @GetMapping("/add")
//    public String showAddTeacherForms(Model model){
//        log.debug("Request to show add teacher forms");
//        model.addAttribute("teacher", new Teacher());
//        return "teachers/forms";
//    }
//
//    @GetMapping("/edit")
//    public String edit(){
//        return "teachers/modifprofesseur";
//    }
//
//}