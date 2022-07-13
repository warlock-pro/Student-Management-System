package in.jayanthvalmiki.sms.entity;
//Coded by JayanthValmiki
import javax.persistence.*;

@Entity
@Table(name = "sms")
public class Student {
    //Coded by JayanthValmiki
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "e_mail", nullable = false)
    private String email;
    //Coded by JayanthValmiki
    public Student() {
    }
    //Coded by JayanthValmiki
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //Coded by JayanthValmiki
    public Long getId() {
        return id;
    }
    //Coded by JayanthValmiki
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    //Coded by JayanthValmiki
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Coded by JayanthValmiki
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
//Coded by JayanthValmiki
