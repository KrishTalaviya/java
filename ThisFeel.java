//Concept of  this keyword//
//This=Reference variable of object//


class Human{
	void print(){
		System.out.println(this);
	}
}

public class Main {
	public static void main(String[] args) {
		//object 1//
		Human obj=new Human();
		System.out.println(obj);
		obj.print();
		//Object 2//
		Human obj2=new Human();
		System.out.println("Object="+obj2);
		obj2.print();
	}
}