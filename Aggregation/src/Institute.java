import java.util.ArrayList;

class Institute {

    String instituteName;
    private ArrayList<Department> departments;

    Institute(String instituteName, ArrayList<Department> departments) {
        this.instituteName = instituteName;
        this.departments = (ArrayList<Department>) departments;
    }

    // общее количество студентов всех департаментов
    // в данном институте
    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        ArrayList<Student> students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                System.out.println(s.name + " " + s.dept);
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}
