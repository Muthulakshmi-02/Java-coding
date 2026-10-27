package OOPs;

class Department {

    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }
}

public class AssociationDemo {

    String studentName;
    Department department;

    AssociationDemo(String studentName, Department department) {
        this.studentName = studentName;
        this.department = department;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department.departmentName);
    }

    public static void main(String[] args) {

        Department dept = new Department("ECE");

        AssociationDemo student =
                new AssociationDemo("Muthulakshmi", dept);

        student.display();
    }
}