//Concept2 of abstraction//
//It is also used to design java program//
//Interface provide you 100% abstraction//
//Methods inside interface must not be static, final, native or strictfp.//
//All variables declared inside interface are implicitly public, static and final.//
//All methods declared inside interfaces are implicitly public and abstract, even if you don't use public or abstract keyword.//
//super keyword can't be used with interface as interface has concept of multiple inheritance which makes super ambigious//
interface Human{
	int a=5;
	void walk();
	void run();
	void sleep();
}
class Student implements Human{
	
	public void walk(){
		System.out.println("walk");
	}
	public void run(){
		System.out.println("run");
	}
	public void sleep(){
		System.out.println("sleep");
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Student obj =new Student();
		obj.sleep();
		System.out.println(obj.a);
		
	}
}