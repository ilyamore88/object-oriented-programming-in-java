import java.util.ArrayList;

class Department {
    String name;
    private ArrayList<Student> students;

    Department(String name, ArrayList<Student> students) {

        this.name = name;
        this.students = students;

    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
