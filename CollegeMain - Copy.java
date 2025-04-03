import java.util.Scanner;

class College {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("College Name: " + name);
    }
}

class Student extends College {
    int roll_no;
    double marks;

    void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }

    void showAll() {
        display();
        System.out.println("Student Roll No: " + roll_no);
        System.out.println("Student Marks: " + marks);
    }
}

class Teacher extends College {
    int id;
    double salary;

    void setId(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void showAll() {
        display();
        System.out.println("Teacher ID: " + id);
        System.out.println("Teacher Salary: " + salary);
    }
}

class CollegeMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("COEP College");
        student.setRollNo(1);
        student.setMarks(95);

        Teacher teacher = new Teacher();
        teacher.setName("PICT College");
        teacher.setId(1);
        teacher.setSalary(50000);

        System.out.println("Student Details:");
        student.showAll();

        System.out.println("\nTeacher Details:");
        teacher.showAll();
    }
}
