//This and Super in inheritance//
class Human{
	void show(){
		System.out.println("parent class show method");
	}
}
class Student extends Human{
	void show(){
		System.out.println("Child class Show method");
	
	}
	void display(){
		System.out.println("Display method");
		this.show();//call current class show method//
		super.show// call parent class show method//
	
	}

}
public class Main {
	public static void main(String[] args) {
	
		
		Student obj2=new Student();
		obj2.display();
		
		
	}
}