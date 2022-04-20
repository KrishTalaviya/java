import java.util.Scanner;
abstract class Vegetable{
	public abstract String toString();
}
class Potato extends Vegetable{
	public String toString(){
		String str="potato and Yellow";
		return str;
	}
		
	}
	class Brinjal extends Vegetable{
	 public String toString(){
		String str="brinjal and Violet";
		return str;
	}
		
	}
	class Tomato extends Vegetable{
	public String toString(){
		String str="Tomato and Red";

		return str;
	}
		
	}


class VegetableDemo{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Vegetable");
		String s=sc.nextLine();
		if (s.equals("potato")) 
		    {
			Potato obj=new Potato();
			System.out.println("potato="+obj.toString());
			}
		else if (s.equals("brinjal"))  
		    {
			Brinjal obj=new Brinjal();
			System.out.println("brinjal="+obj.toString());
			}
		else if (s.equals("potato")) 
		    {
			Tomato obj=new Tomato();
			System.out.println("Tomato="+obj.toString());
			}


		
	}
}