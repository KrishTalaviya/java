class Human{
	void print(){
		System.out.println("Super class method");
	}
	static void print2(){
		System.out.println("method print 2");
	}
}
class Student extends Human{
    @Override
		void print(){
		System.out.println("Sub class method");
	}
	//This method will be hidden by static print2//
   static void print2(){
		System.out.println("method print 2 sub class");
	}
}







public class Main {
	public static void main(String[] args) {
		//If parent class reference(a) is created 
		//with parent object[new parent()] then Parent class method is called//
		Human a=new Human();
		a.print();
		a.print2();
		
		//overrided method called//
	Human c=new Student();
		c.print();
		
		
		
	}
}