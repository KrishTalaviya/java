//Super variable//
//Super keyword is used to access immediate parent class variable from base//
//It is used when there are two variable with same name (one in parent class and another in child class) to call variable of parent class we use super with name of variable// 
class Animal{
	int legs=4;
}
class Human extends Animal{
	int legs=2;
	void display(){
		// will print legs of childclass//
		System.out.println(" no of legs="+legs);
		//will print leg of parentclass//
		System.out.println(" no of legs="+super.legs);
		
	}
}



public class Main {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.display();
		
	}
}