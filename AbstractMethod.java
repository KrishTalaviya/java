class A{
	//throws error as we have no method body that it (abstract method)//
	//A method is abstract if it has no body either we declare it or not declare it//
	//Example is void print is abstract even if we does not have declare it abstract//
	void print();
	void show(){
	System.out.println("Abstract class");
	}
	abstract void display();
}



public class Main {
	public static void main(String[] args) {
		A obj=new A();
		
	}
}