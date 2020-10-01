import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Ivanov", 1, "CSE");
        Student s2 = new Student("Petrov", 2, "CSE");
        Student s3 = new Student("Sidoroff", 1, "EE");
        Student s4 = new Student("Vasiliev", 2, "EE");

        // Создание списка ArrayList студентов CSE .
        ArrayList<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        // Создание списка ArrayList студентов EE
        ArrayList<Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        // creating an instance of Institute.
        Institute institute = new Institute("University ITMO", departments);
        System.out.println("List students in institute of " + institute.instituteName);
        System.out.print(institute.getTotalStudentsInInstitute());
        System.out.print(" - Total students in institute");

    }
}
