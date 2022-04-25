class Human{
	int a;
	int b;
Human(int a){
	this.a=a;
}
Human(int a,int b){
	this(a);
	this.b=b;
}
void display(){
	System.out.println(a);
	System.out.println(b);
	
}

	
}

public class Main {
	public static void main(String[] args) {
		Human obj=new Human(4,5);
		obj.display();
		
	}
}