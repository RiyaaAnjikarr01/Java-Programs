import java.util.Scanner;
	class Array{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			int a[] =new int[5];
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Element in Arr");
			for(int i: a){
				System.out.print(i);
			}
		}
	}