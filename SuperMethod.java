//Super Method//
//If there are two method with same name one in parent class and another in child class it it creates ambiguity//
//If we want use parent class method in sub class then we need to add Super keyword//
class Animal{
	void walk(){
		System.out.println("Parent class methos");
		
	}

}
class Human extends Animal{
	void walk(){
		System.out.println("Child class method");
	}
	void Call(){
		// call method of Child class//
		walk();
		//call method of parent class//
		super.walk();
	}
}
public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.Call();
		
		
		
		
		
	}
}
