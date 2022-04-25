// Method -2 This Keyword//
//Confusion is only in block constructor so when we are using instance variable in constructor or method block we will use this.a

class Human{
	int a;//instance variable a//
	int b;//instance variable b//
	Human(int a,int b){
		this.a=a;//this.a is instance variable//
		this.b=b;//this.b is instance variable//
		// a and b is constructor variable//
		//here this.a will be replaced by obj.a//
	
		
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
	//So outside constructor block only a can be also used as confusion is over out of block//
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
		
		
	}
}
