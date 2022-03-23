import java.util.Scanner;
class ArrayAvg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int avg=0,i;
		int a[]=new int[4];
		for (i=0;i<a.length ;i++ ) {
			System.out.print("enter array element having index ");
			a[i]=sc.nextInt();
			
		}
		for (i=0;i<a.length ;i++ ) {
			avg=avg+a[i];
			
		}
		System.out.println("average of array element="+avg);

		
	}
}