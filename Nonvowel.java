import java.util.Scanner;
class Nonvowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word or sentences");
		String s= sc.next();
		int c=0;
		for(int i=0;i<s.length();i++){
		int ch=s.charAt(i);
		if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
			c++;
			}
		}
		System.out.println(c);
	}
}


