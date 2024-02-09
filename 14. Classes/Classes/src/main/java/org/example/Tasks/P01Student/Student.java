package org.example.Tasks.P01Student;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private Course course;
    private University university;
    private String email;
    private String gsm;

    private static int objects;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String middleName, String lastName) {
        this(firstName, lastName);
        this.middleName = middleName;
    }

    public Student(String firstName, String  midlleName, String lastName, String email, String gsm) {
        this(firstName, midlleName, lastName);
        this.email = email;
        this.gsm = gsm;
        this.course = Course.JAVA;
        this.university = University.SOFTUNI;
        objects++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public static int getObjects() {
        return objects;
    }

    public static void setObjects(int objects) {
        Student.objects = objects;
    }

    @Override
    public String toString() {
        String sb = "Studnet Information:" + "\n" +
                "FirstName: " + this.firstName + "\n" +
                "MiddleName: " + this.middleName + "\n" +
                "LastName: " + this.lastName + "\n" +
                "Email: " + this.email + "\n" +
                "GSM: " + this.gsm + "\n" +
                "Course: " + this.course + "\n" +
                "University: " + this.university;
        return sb;
    }

}
