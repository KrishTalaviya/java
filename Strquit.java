import java.util.*;
public class Strquit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		String str2=str.toLowerCase();
		String str3="quit";
		int i,v=0,c=0;
		int l=str2.length();
		char ch=0;
		if(str.equals(str3)){
	 	System.out.println("program is terminated");
	 }
	 else{
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
}