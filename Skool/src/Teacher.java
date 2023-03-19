public class Teacher {
//Creates the variables for the teacher constructs fields
    String firstName,
            lastName,
            subject;
//constructs a teacher
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
//Changes what the toString method returns
    @Override
    public String toString() {
        return "Name: " + getName() + " Subject: " + getSubject();
    }
}
