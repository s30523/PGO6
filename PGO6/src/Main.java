import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 =new Student("Kaja", "Ambroziak", "ambroziak@wp.pl", "Warsaw, Piekna 12", "333-322-222", new Date(2004, 4, 11));
        System.out.println(s1.getIndexNumber());
    }
}