import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DeanOffice deanOffice = new DeanOffice();
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
        Studies it = new Studies("IT", "AAA", 7, 5);
        deanOffice.enrollStudent(s, it);
        deanOffice.addGrade(s, 5, "PGO");
        deanOffice.addGrade(s, 2, "APBD");
        deanOffice.promoteAllStudents();
        deanOffice.displayInfoAboutAllStudents();
    }
}