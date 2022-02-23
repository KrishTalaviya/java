import java.util.*;
public  class Strpalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter original string=");
		String str=sc.next();
		String revstr="";
		int i,l=str.length();
		for(i=l-1;i>=0;i--){
			revstr=revstr+str.charAt(i);
		}
		if (str.equals(revstr)) {

			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not palindrome");
		}
		
		
		


		
}
}