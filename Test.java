import java.util.Scanner;
class Test{
	static int Y;
	int X;
	void setX(int a){
		X=a;
	}
	static void setY(int b){
		Y=b;
	}
	void show(){
		System.out.println(X);
		System.out.println(Y);
	}
	public static void main(String [] args){
		Test t=new Test();
		t.setX(10);
		t.setY(20);
		t.show();
	}
}