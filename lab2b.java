import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a=");
		int a=sc.nextInt();
		System.out.print("Enter b=");
		 int b=sc.nextInt();
		 System.out.print("Enter Operation Name=");
		 int sum=0;
        String str=sc.next();
        if(str.equals("add"))
        {
           sum=a+b;
           System.out.print("Addition="+sum);
        }
        else if(str.equals("sub"))
        {
        	sum=a-b;
         System.out.print("Subtraction="+sum);
        }
        else if(str.equals("mul"))
        {
        	sum=a*b;
        	System.out.print("Multiplication="+sum);
        }
        else if(str.equals("div"))
        {
        	sum=a/b;
        	System.out.print("Division="+sum);
        }
        
        
           
         
         
		
		
		
	}
}