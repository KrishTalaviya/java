//Ambiguity without this variable//
//If we don't use this than in intialize constructor it will create confusion that which variable is instance or which is parameterized//
class Human{
	int a;//instance variable a//
	int b;//instance variable b//
	Human(int a,int b){
		a=a;//Confusion for java//
		b=b;
	//To solve this confusion there are 2 ways//
	//1.Different Name of parameters and instance variable//
	//2.this keyword//
		
	}
	void print(){
		System.out.println(a);
		System.out.println(b);
	}
	
}




public class Main {
	public static void main(String[] args) {
		Human obj=new Human(2,3);
		obj.print();
		
		
	}
}