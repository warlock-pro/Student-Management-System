package in.jayanthvalmiki.sms;
//Coded by JayanthValmiki
import in.jayanthvalmiki.sms.entity.Student;
import in.jayanthvalmiki.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
//Coded by JayanthValmiki
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
//Coded by JayanthValmiki
