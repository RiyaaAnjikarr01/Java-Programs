import java.io.*;
class Employee1 implements Serializable{
int  id;
String name;
double salary;

Employee1(int i,String n,double d){
id=i;
name=n;
salary=d;
}
void display(){


System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
}
}
class ObjectOTest{
public static void main(String [] args) throws Exception{
Employee1 e1 =new Employee1(101,"xyz",5000);
Employee1 e2 =new Employee1(102,"abc",4500);
Employee1 e3 =new Employee1(103,"ijk",6000);



ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("emp.dat"));
out.writeObject(e1);
        out.writeObject(e2);
        out.writeObject(e3);
        out.close();


ObjectInputStream OIS =new ObjectInputStream(new FileInputStream("emp.dat"));
try{
while(true){
Employee1 e=(Employee1)OIS.readObject();
e.display();
}
}catch(EOFException e){
//OIS.close();
}finally{
	OIS.close();
}
}
}

