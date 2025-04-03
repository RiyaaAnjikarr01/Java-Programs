import java.util.Scanner;
class E{
	class student{
		int roll_no;
		String name;
		double marks;

		void setData(int r,String n,double m){
			roll_no=r;
			name=n;
			marks=m;
		}
		void display(){
			System.out.println(roll_no+" "+name+" "+marks);
		}
	}
	public static void main(String[] args){
		E outer = new E();
		student s1=outer.new student();
		s1.setData (64,"abc",90);
		s1.display();
	}
}