// Method used without this//
class Human{
	void show(){
		System.out.println("Show method");
	}
	void display(){
		System.out.println("Display method");
		show();
	}
}

public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.display();
		
	}
}