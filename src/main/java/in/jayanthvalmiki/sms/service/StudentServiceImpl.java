package in.jayanthvalmiki.sms.service;

import in.jayanthvalmiki.sms.entity.Student;
import in.jayanthvalmiki.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//Coded by JayanthValmiki
@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
    //Coded by JayanthValmiki
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    //Coded by JayanthValmiki
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    //Coded by JayanthValmiki
    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }
    //Coded by JayanthValmiki
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
//Coded by JayanthValmiki