package JavaCore_HomeWork12;

public class Student {


    private String firstName;
    private String lastName;
    private int course;
    private String group;

    public Student() {
    }

    public Student(String firstName, String lastName, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + "  Спеціальність - " + group + ",  Курс - " + course ;
    }
}
