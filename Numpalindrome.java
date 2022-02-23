import java.util.*;
public  class Numpalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter original number=");
		int n=sc.nextInt();
		int temp=n;
		int rem,rev=0;
		 while(n>0){
		 	rem=n%10;
		 	rev=rem=(rev*10);
		 	n=n/10;

		 }
		 if(temp==rev){
		 	System.out.print("number is palindrome");
		 }
		 else{
		 	System.out.print("number is not palindrome");
		 }

		


		
}
}