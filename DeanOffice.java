import java.util.ArrayList;
import java.util.List;

public class DeanOffice {
    private List<Student> students;

    public DeanOffice() {
        students = new ArrayList<>();
    }

    public void enrollStudent(Student student, Studies studies) {
        student.addStudyProgram(studies.getProgramName());
        student.promoteToNextSemester();
        students.add(student);
    }

    public void addGrade(Student student, int grade, String courseName) {
        student.addGrade(grade, courseName);
    }

    public void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public void displayInfoAboutAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
