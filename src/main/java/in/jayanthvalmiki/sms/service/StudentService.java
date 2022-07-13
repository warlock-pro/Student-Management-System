package in.jayanthvalmiki.sms.service;

import in.jayanthvalmiki.sms.entity.Student;

import java.util.List;
//Coded by JayanthValmiki
public interface StudentService {

    List<Student> getStudentList();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student editStudent(Student student);
    //Coded by JayanthValmiki
    void deleteStudentById(Long id);

}
//Coded by JayanthValmiki