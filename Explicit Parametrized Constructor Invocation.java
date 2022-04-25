//Explicit Parametrized constructor Imvocation//
//this is used for calling current class constructor from other constructor of same class//
//Constructor called should be always in first line from other code//
class Human{
	Human(){
		this(5);
		
		
		System.out.println("Default constructor");
		
	}
	Human(int n){
		  
		System.out.println("Parametrized constructor");
		
}
}
public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		
		
		
	}
}