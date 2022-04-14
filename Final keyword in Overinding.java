class Human{
   	//If we declare word final to parent class method then sub class method can't overide it and it generates compile time error//'
   	final void print(){
	System.out.println("Super class method");
	}
}
class Student extends Human{
    @Override
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
		
		//overrided method called//
	Human c=new Student();
		c.print();
		
		
	}
}