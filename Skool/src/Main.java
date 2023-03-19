public class Main {
    public static void main(String[] args) {
        School school = new School("UHill",12,true);
        Teacher teacher = new Teacher("Dave","Smith","History");
        Teacher teacher1 = new Teacher("Mike","Davies","Math");
        Teacher teacher2 = new Teacher("Paul", "Zaremba","Computers");
        Student student = new Student("Kai","Sonnichsen",12);
        Student student1 = new Student("Suzana","Hallman",10);
        Student student2 = new Student("Maxima","Arbeid",8);
        Student student3 = new Student("Ahsoka","Chaplin",11);
        Student student4 = new Student("Peter","Biancardi",9);
        Student student5 = new Student("Esmaeel","kyle",12);
        Student student6 = new Student("Jordan","Park",10);
        Student student7 = new Student("Camilla","alfero",8);
        Student student8 = new Student("Mara","Lane",11);
        Student student9 = new Student("Jesse","Barr",9);
        school.addTeacher(teacher);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addStudent(student);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        System.out.println(school.showTeachers());
        System.out.println(school.showStudents());
        school.deleteStudent(student1);
        school.deleteStudent(student6);
        school.deleteTeacher(teacher1);
        System.out.println(school.showTeachers());
        System.out.println(school.showStudents());
    }
}