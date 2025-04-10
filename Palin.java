import java.util.Scanner;
class Palin{
	public static void main(String[] args){
		System.out.print("Enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int revnum=0;
		//int dup=0;
		int dup =n;
		while(n>0){
			int ld=n%10;
			revnum=(revnum*10)+ld;
			n=n/10;
		}
		if(dup==revnum){
			System.out.print("palindrome number");
		}
		else{
			System.out.print("not palindrome");
		}
}
}