import java.util.Scanner;

class H{
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
		 Scanner sc=new Scanner(System.in);
		 int d=sc.nextInt();
		 Employee e[]=new Employee[d];
		 for(int i=0;i<d;i++){
			 System.out.print("Enter id:");
			 int id=sc.nextInt();
			 System.out.print("Enter name:");
			 String n=sc.next();
			 System.out.print("Enter Salary:");
			 Double sa=sc.nextDouble();
			 e[i]=new Employee();
			 e[i].setData(id,n,sa);
		 }
		 System.out.print("name"+""+"salary"+""+"id");
		 for(Employee e1:e){
			 e1.display();
		 }
	 }
 }
