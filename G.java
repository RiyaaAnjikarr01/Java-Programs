import java.util.Scanner;

class G{
    static class Employee {
        int id;
        String name;
        double salary;

        void setData(int i, String n, double s) {
            id = i;
            name = n;
            salary = s;
        }

        void display() {
            System.out.println(id + " " + name + " " + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setData(101, "Riya Anjikar", 75000.50);
        emp1.display();
    }
}
