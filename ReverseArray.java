import java.util.Scanner;
class ReverseArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int[] a=new int[5];
		System.out.println("array length="+a.length);
		for (i=0;i<a.length ;i++ ) {
			System.out.print("enter array element");
			a[i]=sc.nextInt();
			
		}
		for (i=(a.length-1);i>=0;i-- ) {
			System.out.println("elments ion reverse order="+a[i]);

			
		}
	}
}