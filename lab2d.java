import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		System.out.print("Area of Circle="+area);
		
	}
}