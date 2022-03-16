
import java.util.Scanner;
class Celsius{
	 static void  convTemp(float fr){
		double result=fr-(32.0*(5.0/9.0));
		System.out.println("celsius="+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter fharenheit=");
		float fr=sc.nextInt();
		convTemp(fr);

	}


}