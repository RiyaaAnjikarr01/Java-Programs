	import java.util.Scanner;
	class Ary{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			int a[] =new int[5];
			int s=0;
			System.out.println("Enter 5 integers:");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
				s=s+a[i];

			}
			System.out.print("Element in Arr");
			//int s=0;
			for(int i: a){
				System.out.println(i);
			}
			System.out.println("sum of all elements in the array:"+s);
		}
	}
