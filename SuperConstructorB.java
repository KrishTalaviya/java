//Super class default constructor explicit call//
//Super constructor will always be called when a child class constructor is called//
class Animal{
	Animal(){
		System.out.println("Parent constructor");
		
   	}
}
class Human extends Animal{
	Human(){
		   // No need to write this as java will automatically add it at starting point of child class constructor//
		   super();
		System.out.println("Child constructor");
	}
}




public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
}
}
