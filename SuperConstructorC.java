//Super parametrized constructor//

class Animal{
	int n;
	Animal(int n){
		System.out.println("Parent constructor"+n);
		
   	}
}
class Human extends Animal{
	Human(){
		   // If there is parametrized constructor in parent class then we should add super(parameter) at starting as child class constructor need parent class constructor otherwise compile time error will be generated//
		   super(5);
		System.out.println("Child constructor");
	}
}




public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
}
}
