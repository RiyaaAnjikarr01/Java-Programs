import java.util.Scanner;
class B{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String t="";
		for(int i=s.length()-1;i>=0;i--){
			t=t+s.charAt(i);
		}
		if(s.equals(t)){
			System.out.print("palindrome");
		}
		else{
			System.out.print("not palindrome");
		}
	}
}