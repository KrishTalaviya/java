abstract  class Human{
	Human(){
		System.out.println("parent abstract constructor");
	}
}
class Student extends Human{
	// when we call child constructor,parent class abstract constructor is called,similaraly like normal constructor//
	Student(){
		System.out.println("Child constructor");
	}
	
}
public class Main {
	public static void main(String[] args) {
		//here when object is called constructor of child class
		Student obj =new Student();
		
	}
}