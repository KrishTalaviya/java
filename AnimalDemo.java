interface Transport{
	public void deliver();
}
abstract class Animal{
	void animalShow(){
		System.out.println("concrete method of animal");
	}
}
class Tiger extends Animal{
	void tigerShow(){
		System.out.println("concrete method of tige");
	}

}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("abstarct camel");
	}
	void camelShow(){
		System.out.println("concrete method of camel");
	}


}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("abstarct deliver");
	}
	void DonkeyShow(){
		System.out.println("concrete method of donkey");
	}


}
class Deer extends Animal{
	void deerShow(){
		System.out.println("concrete method of deer");
	}
}
public class AnimalDemo{
	public static void main(String[] args) {
		
		Deer d=new Deer();
		Tiger a=new Tiger();
		Camel b=new Camel();
		Donkey c=new Donkey();
		b.deliver();
		c.deliver();

	}
}




