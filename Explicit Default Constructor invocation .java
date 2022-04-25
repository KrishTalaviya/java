//Explicit Default constructor Imvocation//
//this is used for calling current class constructor from other constructor of same class//
class Human{
	Human(){
		
		
		System.out.println("Default constructor");
		
	}
	Human(int n){
		  this();
		System.out.println("Parametrized constructor");
		
}
}
public class Main {
	public static void main(String[] args) {
		Human obj=new Human(5);
		
		
		
	}
}