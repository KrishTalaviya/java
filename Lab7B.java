interface A{
	
	public  void printA();
	int c=10;

}
interface A1 extends A{
	int a1=10;
	public  void printA1();
}
interface A2 extends A{
	int a2=30;
	public void printA2();
}
interface P1{
	int p1=40;
	public void printP1();

}
interface P2{
	int p2=50;
	public void printP2();

}
interface A12 extends P1,P2{
	int a12=40;
 public void printA12();

}
class B implements A12{
      public void printA(){
      	System.out.println("A");
      }
      public void printA1(){
      	System.out.println("A1");
      }
      public void printA2(){
      	System.out.println("A2");
      }
      public void printP1(){
      	System.out.println("P1");
      }
      public void printP2(){
      	System.out.println("P2");
      }
      public void printA12(){
      	System.out.println("A12");
      }
      public void printB(){
      	System.out.println("B");
      }



}
class Lab7B{
	public static void main(String[] args) {
		B obj=new B();
		obj.printA12();
		System.out.println(obj.a12);
		obj.printP2();
		System.out.println(obj.p2);
		
		
		
		
	}
}
