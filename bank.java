import java.util.Scanner;
class bank{
	static String bankname="SBI";
	String customername;
	int accountno;
	double balance;
	String branch;


	bank(String customername,int accountno,double balance,String branch){
		this.customername=customername;
		this.accountno=accountno;
		this.balance=balance;
		this.branch=branch;
	}

	static void displaybankname(){
		System.out.println("Welcome to"+bankname);
	}

	void displaycustomerdetails(){
		System.out.println("Customer name:"+ customername);
		System.out.println("Account no:"+ accountno);
		System.out.println("Branch:" + branch);
        System.out.println("Balance:" + balance);
	}
	public static void main(String[] args){
		displaybankname();

		bank cus1=new bank("Riya",1,80000,"Germany");
		bank cus2=new bank("Shreya",2,70000,"Japan");

		cus1.displaycustomerdetails();
		cus2.displaycustomerdetails();

	}
}