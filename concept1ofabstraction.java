//Concept of abstraction for hiding details//
//There is need of sometimes hiding the details Suppose owner need only description related to him and garage need description related to him and general decription is needed by both//

//Abstract class vechicle//
abstract class Vechicle{
	//Two abstract mehod garage and Owner description//
	//we declare owner and garage abstract so only authorized user can access it//
	abstract public void OwnerDescription();
	abstract public void GarageDescription();
	//One concrete method General//
	//General is for all so it is not abstract or concrete or normal method//
	void GeneralDescription(){
		System.out.println("General description");
		
	}
}
//we need to compulsory overide all abstract method in child class//
//Concrete method overiden is not compulsory//
//If I declare two abstract method in parent class then it is both abstarct method should be overide in all parent class i.e.//
//method1,method2 overide in child class1//
//method1,method2 overide in child class2//
//method1 overide in child class1 and method 2 is overiden in child class 2 will give error//

class Owner extends Vechicle{
	public void OwnerDescription(){
		System.out.println("owner description");
	}
	//Owner can't acess the details//'
	public void GarageDescription(){
	System.out.println("only garage can access it");
		
	}
	
}

class Garage extends Vechicle{
	public void GarageDescription(){
		System.out.println("Garage description");
	}
	//Garage can't access it//'
	public void OwnerDescription(){
		System.out.println("only owner can access it");
	}
}





public class Main {
	public static void main(String[] args) {
		Owner obj=new Owner();
		obj.GeneralDescription();
		obj.GarageDescription();
		obj.OwnerDescription();
		Garage obj2=new Garage();
		obj2.GeneralDescription();
		obj2.OwnerDescription();
		obj2.GarageDescription();
		
	}
}