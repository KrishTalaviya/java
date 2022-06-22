import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int index;
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			if(a[i]==n1){
				a[i]=n2;
				index=i;
			}
		}
		for(int i=0;i<5;i++){
			System.out.println("arrayindex"+a[i]);
		}
		System.out.print("indexNumber="+i);
	}
}