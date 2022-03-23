import java.util.Scanner;
class ForEach{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int a[]=new int[4];
		for (i=0;i<4 ;i++ ) {
			System.out.print("enter array element having index ");
			a[i]=sc.nextInt();
			
		}
		for (int j:a ) {
			System.out.println(j);
			
		}

		
	}
}