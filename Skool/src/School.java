import java.util.ArrayList;
//Creates the class 'School' which holds 'students' and 'teachers'
public class School {
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
    //creates variables for the fields needed for 'School'
    String name;
    int yearBuilt;
    boolean parkingLot;

    //Constructs the school and assigns it fields
    School(String name, int yearBuilt, boolean parkingLot) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.parkingLot = parkingLot;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public boolean hasParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(boolean parkingLot) {
        this.parkingLot = parkingLot;
    }
//Adds a new teacher
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
//Adds a new student
    public void addStudent(Student student) {
        students.add(student);
    }
//Deletes/removes a teacher
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
//Deletes/removes a student
    public void deleteStudent(Student student) {
        students.remove(student);
    }

//    Creates a string composed of all teachers to be returned
    public String showTeachers() {
        String str = "";

        for (Teacher teacher : teachers) {
            str = str + "[" + teacher + "]";
        }

        return str;
    }
// Creates as string composed of all students to be returned
    public String showStudents() {
        String str = "";

        for (Student student : students){
            str = str + "[" + student + "]";
        }

        return str;
    }
}
