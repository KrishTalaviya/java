class Human{
	Human(){
		this(5);
		System.out.println("Default constructor");
		
	}
	Human(int n){
		
		//if we write Human(); it will give error//
		//so to call constructor of same class we have to write this()//
		
		this();
		System.out.println("Parametrized constructor");
		
}
}
public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		
		
		
	}
}