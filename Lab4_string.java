import java.util.*;
public class Lab4_string{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		String str2=str.toLowerCase();
		int i,v=0,c=0;
		int l=str2.length();
		char ch=0;
		for (i=0;i<l ;i++ ) {
			  ch=str2.charAt(i);
			 if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			 	v++;
			 	
			 }
			 else {
			 	c++;
			 }
			
		}
	 System.out.println("number of vowels"+v);
	 System.out.println("number of consonant"+c);
	}
}