import java.util.Scanner;
class con{
	public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CGPA(1-5)");
        System.out.println("Enter CGPA(5-10)");
        System.out.println("Enter CGPA(10-20)");
        int c= sc.nextInt();
        switch(c){
			case 1:System.out.println("Fail");
			break;
			case 2:System.out.println("Fail");
			break;
			case 3:System.out.println("Fail");
			break;
			case 4:System.out.println("Fail");
			break;
			case 5:System.out.println("Average");
			break;
			case 6: System.out.println("Average");
			break;
			case 7:System.out.println("Average");
			break;
			case 8:System.out.println("Average");
			break;
			case 9:System.out.println("Average");
			break;
			case 10:System.out.println("Average");
			break;
			case 11:System.out.println("Good");
			break;
			case 12:System.out.println("Good");
			break;
			case 13:System.out.println("Good");
			break;
			case 14:System.out.println("Good");
			break;
			case 15:System.out.println("Good");
			break;
			case 16:System.out.println("Good");
			break;
			case 17:System.out.println("Good");
			break;
			case 18:System.out.println("Good");
			break;
			case 19:System.out.println("Good");
			break;
			case 20:System.out.println("Good");
			break;

			default:System.out.println("invalid input");
		}
	}
}
