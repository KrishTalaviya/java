import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x;
		Digit dg=new Digit();
		dg.dig(n);
		System.out.print("number="+dg.i);

	}

}
class Digit{
	int i=0;
	int dig(int n){
		if(n>10){
         i++;
         return dig(n/10);
		}
		else{
			i++;
			return 0;
		}
	}
}