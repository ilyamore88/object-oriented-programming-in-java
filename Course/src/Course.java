public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.students[i].equals(student)) {
                String[] copyArray = new String[this.numberOfStudents - 1];
                System.arraycopy(this.students, 0, copyArray, 0, i);
                System.arraycopy(this.students, i + 1, copyArray, i, this.numberOfStudents - i - 1);
                break;
            }
        }
    }
}
