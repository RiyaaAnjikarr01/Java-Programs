import java.util.Scanner;
class A{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
			c++;

		}
		}
		System.out.print(c);
	}
}
