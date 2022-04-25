//Super class default constructor default call//
//Super constructor will always be called when a child class constructor is called//
class Animal{
	Animal(){
		System.out.println("Parent constructor");
		
	}
}
class Human extends Animal{
	Human(){
		// Java Jvm will add a default line super() inside child class constructor at very starting point whether we add it or not add it//
		 //this super() will call default constructor of parent class
		System.out.println("Child constructor");
	}
}




public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		
	}
}