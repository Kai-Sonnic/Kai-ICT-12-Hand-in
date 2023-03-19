public class Student {
//creates the fields for the student construct
    String firstName,
            lastName;
    int grade;
    static int nextStudentNumber = 1;
    int studentNumber;
//constructs a student and assigns it fields
    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = nextStudentNumber;
        nextStudentNumber++;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
//Changes what the toString method returns
    @Override
    public String toString() {
        return "Name: " + getName() + " Grade: " + getGrade();
    }
}
