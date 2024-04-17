import java.util.ArrayList;
import java.util.Date;
public class Student {
    private String name;
    private String lname;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    static int count = 1;
    int indexNumber;
    static ArrayList<Student> students = new ArrayList<Student>();
    static  ArrayList<Grade> grades = new ArrayList<Grade>();


    public Student(String name, String lname, String email, String address, String phoneNumber, Date birthDate) {
        this.name = name;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        Student.students.add(this);
        indexNumber = count++;
        this.grades = new ArrayList<Grade>();
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public static int getCount() {
        return count;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public void addGrade(int value, String name){
        Grade grade = new Grade(value, name);
        grades.add(grade);

    }

}
