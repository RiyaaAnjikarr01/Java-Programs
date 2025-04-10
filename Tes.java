import java.util.Scanner;
class Tes{
	int X;
	static int Y;

	//make constructor
	Tes(int a,int b){
		X=a;
		Y=b;
	}

	//static method to display Y
	static void display(){
		System.out.println(Y);
	}
	public static void main(String [] args){
		Tes.display();//calling static method


		Tes t1=new Tes(10,20);
		Tes t2=new Tes(20,30);
		Tes t3=new Tes(30,40);
		Tes.display();
	}
}

