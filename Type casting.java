import java.lang.*;
public class Main {
	public static void main(String[] args) {
		//Automatic or widening Type Casting//
		byte a=5;
		int b=a;
		System.out.println(b);
		//Explicit or Narrowing Type Casting//
		int c=5;
		byte d=(byte)c;
		System.out.println(d);
		//Parse method to convert Number as String into primitive data type//
		int x=Integer.parseInt("9");
		double y= Double.parseDouble("9");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
}