import java.util.Scanner;
class Rev{
	public static void main(String[] args){
		System.out.print("Enter any number");
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}