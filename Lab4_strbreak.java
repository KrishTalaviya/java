import java.util.*;
public class Lab4_strbreak{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		int l=str.length();
		int i;
		char ch=0;
		for (i=l/2;i<l ;i++ ) {
			ch=str.charAt(i);
			System.out.println(ch);
			
		}
		
	 System.out.println("length of string"+l);
	}
}