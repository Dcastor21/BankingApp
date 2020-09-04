import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj1= new BankAccount("kevin","70D*09000");
				obj1.showMenu();

	}

}





class BankAccount{
	int balance;
	int PrevTrans;
	String CustName;
	String CustId;
	
	BankAccount(String cname, String cid)
	{
		CustName=cname;
		CustId=cid;
	}
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance + amount;
			PrevTrans = amount;
		}
	}
	
	void withdraw(int amount) {
	if(amount !=0)
	{
		balance = balance - amount;
		PrevTrans = -amount;
	}
}
	void getPrevTrans() {
	if(PrevTrans>0)
	{
		System.out.println("Deposited: "+PrevTrans);
	}
	else if(PrevTrans<0 )
	{
		System.out.println("Withdrawn: "+Math.abs(PrevTrans));
	}
	else
	{
		System.out.println("No transaction occured");
	}
	
}
	void showMenu()
	{
		char option='\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+CustName);
		System.out.println("Your ID is "+CustId);
		
		System.out.println("\n");
		
		
		do {
		System.out.println("=====================================================================================");
		System.out.println("Enter an option: \n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Previous Transaction");
		System.out.println("E.Exit");
		System.out.println("=====================================================================================");
		
		option=sc.next().charAt(0);
		switch(option) {
		
		case 'A':
			System.out.println("=====================================================================================");
			System.out.println("Your Balance: "+balance);
			System.out.println("=====================================================================================");
			System.out.println("\n");
			break;
			
		case 'B':
			System.out.println("------------------------------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("-------------------------------------------------");
			int amount = sc.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("------------------------------------------------");
			System.out.println("Enter an amount to withdraw:");
			System.out.println("-------------------------------------------------");
			int amount2 = sc.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
		case 'D':
			System.out.println("------------------------------------------------");
			getPrevTrans();
			System.out.println("-------------------------------------------------");
			System.out.println("\n");
			break;	
			
		case 'E':
			System.out.println("------------------------------------------------");
			break;	
			
		default:
			System.out.println("Invalid option!! Please try again");
			break;
			
		}
		
		}while(option != 'E');
		System.out.println("Thank You for using our services");
	}
}

