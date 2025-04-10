class per{
	String name;
	int age;
	per(String n,int a){
		name=n;
		age=a;
	}
}
class employee extends per{
	double sal;
	employee(String n,int a,double s){
		super(n,a);
		sal=s;
	}
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("salary:" +sal);
	}
}
class Superper{
	public static void main(String[] args){
		employee e=new employee("riya",21,80000.78);
		e.display();
	}
}