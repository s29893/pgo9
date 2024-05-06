import java.util.*;

public class Student {
    private static int nextIndexNumber = 1;

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String address;
    private String phoneNumber;
    private String indexNumber;
    private String status;
    private int currentSemester;
    private List<String> studyPrograms;
    private Map<String, Integer> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = "s" + nextIndexNumber++;
        this.status = "Candidate";
        this.studyPrograms = new ArrayList<>();
        this.grades = new HashMap<>();
    }


    public void addStudyProgram(String program) {
        studyPrograms.add(program);
    }

    public void addGrade(int grade, String courseName) {
        grades.put(courseName, grade);
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyPrograms.size() && currentSemester < grades.size()) {
            currentSemester++;
            if (currentSemester == studyPrograms.size()) {
                status = "Graduate";
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Index Number: " + indexNumber);
        System.out.println("Status: " + status);
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Study Programs: " + studyPrograms);
        System.out.println("Grades: " + grades);
    }
}
