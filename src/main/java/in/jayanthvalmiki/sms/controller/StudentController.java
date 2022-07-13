package in.jayanthvalmiki.sms.controller;
import in.jayanthvalmiki.sms.entity.Student;
import in.jayanthvalmiki.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//Coded by JayanthValmiki
@RequestMapping
@Controller
public class StudentController {

    private StudentService studentService;
    //Coded by JayanthValmiki
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String StudentList(Model model){
        model.addAttribute("students", studentService.getStudentList());
        return "students";
    }
    //Coded by JayanthValmiki
    @GetMapping("/students/new")
    public String CreateStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }
    //Coded by JayanthValmiki
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    //Coded by JayanthValmiki
    @GetMapping("/students/edit/{id}")
    public  String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }
    //Coded by JayanthValmiki
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model){

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.editStudent(existingStudent);
        return "redirect:/students";
    }
    //Coded by JayanthValmiki
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
//Coded by JayanthValmiki
