import java.util.Scanner;
public class Bank_Account{
	  int actno;
	  
	  String username;
	  String email;
	  String accounttype;
	  double actbal;
	 public  void getaccountdetails(){
	 	Scanner sc=new Scanner(System.in);
	 	System.out.print("enter account no ");
	 	actno=sc.nextInt();
	 	System.out.print("enter account balance ");
	 	actbal=sc.nextDouble();
	 	System.out.print("enter username  ");
	 	username=sc.nextLine();
	 	System.out.print("enter account type ");
	 	accounttype=sc.nextLine();
	 	System.out.print("enter email ");
	 	email=sc.nextLine();
	 	
	 }
	 public  void printaccountdetails(){
	 	System.out.println("Account no="+actno);
	 	System.out.println("account balance="+actbal);
	 	System.out.println("username="+username);
	 	System.out.println("email="+email);
	 	System.out.println("account Type="+accounttype);

	 }
}