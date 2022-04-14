// Final  keyword
//Final Variable-Make variable Constant//
//Final Method-Stop overidding Super class method by Sub class method (Given to Super class)
//Final Class-Stop inheritance of Class//

class Variable{
	//Intializing  direct final variable//
	final int ACTNO=10;
	//blank final variable//
	final String NAME;
	//Intializing blank final Variable//
	{
		 NAME="Abc";
		 
	}
	//Static Final Variable//
	final double PI=3.141;
	//blank static final variable//
	static final int A;
	//intializing static final variable//
	static{
		A=10;
		
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		Variable obj=new Variable();
		
		System.out.print(obj.NAME);
		System.out.print(obj.A);
		System.out.print(obj.PI);
		System.out.print(obj.ACTNO);
	}
}