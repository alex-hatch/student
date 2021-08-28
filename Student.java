package cs151;

public class Student {
    private String firstName;
    private String lastname;
    private String major;
    private String department;
    private int age;
    private double gpa;

    public Student(String firstName, String lastname, String major, String department, int age, double gpa) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMajor() {
        return major;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    public void setLastname(String newLastName) {
        lastname = newLastName;
    }

    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    class Course {
        public void printSchedule() {
            System.out.println("CS151 Tue/Thur 6-7:15");
            System.out.println("ENG101 Mon/Wed 10-11:15");
            System.out.println("HIST100 Tue/Thur 1:30-2:45");
        }
    }

}
