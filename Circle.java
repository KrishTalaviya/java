import java.util.*;
class Circle{
	static void circleArea(float r){
		double sum=Math.PI*r*r;
		System.out.print("area of circle="+sum);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter radius");
		float r=sc.nextInt();
		circleArea(r);

	}
}