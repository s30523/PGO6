import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 =new Student("Kaja", "Ambroziak", "ambroziak@wp.pl", "Warsaw, Piekna 12", "333-322-222", new Date(2004, 4, 11));
    
        Student s2 =new Student ("Jan", "Kowalski","kowalski@gmail.com", "Lublin", "123-345-567", new Date(2002, 2, 21));

        StudyProgramme zi =new StudyProgramme("ZI", "AAA", 7, 6);
        StudyProgramme it =new StudyProgramme("IT", "AAA", 7, 5);

        s1.enrollStudent(zi);
        s2.enrollStudent(it);
        Students.displayInfoAboutAllStudents();

        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();

        Student s3 = new Student ("Marta", "Miko", "mmiko@gmail.com", "Warsaw", "000-111-222", new Date(2003, 5, 1));
        Students.displayInfoAboutAllStudents();

    }
}
