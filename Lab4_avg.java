import java.util.*;
public class Lab4_avg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n");
		int n=sc.nextInt();
		int x[]=new int[n];
		int i,sum=0;
		for (i=0;i<n ;i++ ) {
			System.out.print("enter array element x[]"+i);
			x[i]=sc.nextInt();
			
		}
		for (i=0;i<n ;i++ ) {
			sum=sum+x[i];
			
		}
	System.out.println("sum of array element="+sum);

	}
}