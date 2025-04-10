import java.util.Scanner;
class Maxelement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[] =new int[5];
		System.out.print("Enter 5 integer:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int value:a){
			if(value > max){
				max=value;
			}
		}
		System.out.println("Maximum no in array:"+max);
	}
}