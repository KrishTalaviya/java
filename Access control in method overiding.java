//Access Control and Inheritance
//The following rules for inherited methods are enforced −

//Methods declared public in a superclass also must be public in all subclasses.

//Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.

//Methods declared private are not inherited at all, so there is no rule for them.//
// Super class method should have more restriction than Sub class method//

class Human{
  protected void print(){
		System.out.println("Super class method");
	}
}
class Student extends Human{
  public void print(){
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
		//If reference of parent is created and object of child then child method overides parent method so it is called Run time polymorphism//
		Human c=new Student();
		c.print();
		//if reference of Subclass os created and object of Superclass,compile time error because of incompatibpe type human can be inside student//
		
		
	}
}