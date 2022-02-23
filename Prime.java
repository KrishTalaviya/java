import java.util.*;
public  class Prime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter  number=");
		int n=sc.nextInt();
		int flag=0,i;
		for (i=2;i<n ;i++ ) {
			if(n%i==0){
				flag=1;
			}
			
		}
		if(flag==0){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}

		


		
}
}