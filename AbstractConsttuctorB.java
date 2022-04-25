abstract  class Human{
	int a;
	Human(int a){
		this.a=a;
		System.out.println("parent abstract constructor="+a);
	}
}
class Student extends Human{
	int b;
	// when we call child constructor,parent class abstract constructor is called,similaraly like normal super parametrized constructor//
	Student(int a,int b){
		super(5);
		this.b=b;
		System.out.println("Child constructor"+a+","+b);
	}
	
}
public class Main {
	public static void main(String[] args) {
		//here when object is called constructor of child class
		Student obj =new Student(2,5);
		
	}
}