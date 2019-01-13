package api;


import javax.persistence.*;

@Entity
@Table(name = "user_detail")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="Age")
    private int age;
    @Column(name="Email")
    private String email;

    public UserDetails() {  }

    public UserDetails(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String UserDetailsNotFoundException() {
        return "Patient{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
