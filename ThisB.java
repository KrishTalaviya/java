//Method 1- Different Name//
//if parameter and instance have diifferent name then confusion is over//
class Human{
	int a;//instance variable a//
	int b;//instance variable b//
	Human(int p,int q){
		a=p;//Confusion over for java//
		b=q;
	
		
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
		System.out.println(obj.a);
		
		
		
	}
}
