import java.util.*;
public class Lab4_rev{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int rev=0,rem,i ;
		for (i=0;i<n ;i++ ) {
         int b=n%10;
          n=n/10;
          rev=rev*10+b;

			
		}
		System.out.println("reverse="+rev);
			
		
	}
}