import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Fahrenheit=");
		double f=sc.nextDouble();
		double celsius=(f-32)*0.555555556;
		System.out.print("Celsius="+celsius);
		
	}
}