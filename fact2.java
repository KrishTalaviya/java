import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int i,f;
		Factorial fc=new Factorial();
		f=fc.fact(n);
		

		
		System.out.println("factorial="+f);
	}
}
class Factorial{
		int fact(int n)
		{
		    if(n==1){
		     return 1;
		    }
		    else{
			return (fact(n-1)*n);
		    }
		}


}