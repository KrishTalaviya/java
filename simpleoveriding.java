// Simple method overiding//
class Human{
	void print(){
		System.out.println("Super class method");
	}
}
class Student extends Human{
	void print(){
		System.out.println("Sub class method");
	}
}







public class Main {
	public static void main(String[] args) {
		//If parent class reference(a) is created 
		//with parent object[new parent()] then Parent class method is called//
		Human a=new Human();
		a.print();
		//If child clas reference is created with object then child class method is callef//
		Student b=new Student();
		b.print();
		//If reference of parent is created and object of child(upcasting) then child method overides parent method so it is called Run time polymorphism or Dynamic method dispatch //
		Human c=new Student();
		c.print();
		//if reference of Subclass os created and object of Superclass,compile time error because of incompatibpe type human can be inside student//
		
		
	}
}