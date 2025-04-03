import java.util.Scanner;
	class C{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			String [] s=new String[5];
			for(int i=0;i<s.length;i++){
				s[i]=sc.nextLine();
				System.out.print("Names are:");
			}
			for(String i:s){
				if(i.charAt(0)=='A'||i.charAt(0)=='a'){
					System.out.println(i);
				}
			}
		}
	}
