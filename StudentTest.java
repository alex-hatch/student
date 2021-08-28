package cs151;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith", "Computer Science", "School of Computer Science", 20, 3.6);
        Student.Course courses = student1.new Course();
        courses.printSchedule();
    }
}
