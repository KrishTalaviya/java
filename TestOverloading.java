import java.util.Scanner;
class TestOverloading{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a=");
		int a=sc.nextInt();
		System.out.print("enter b=");
		int b=sc.nextInt();
		System.out.print("enter c=");
		int c=sc.nextInt();
		System.out.print("enter x=");
		double x=sc.nextDouble();
		System.out.print("enter y=");
		double y=sc.nextDouble();
		int result1=0,result2=0,result4=0;
		double result3;
		MethodOverload obj= new MethodOverload();
		
		result1=obj.add(a,b);
		result2=obj.add(a,b,c);
		result4=obj.sub(a,b);
		result3=obj.sub(x,y);

		System.out.println("result="+result1);
		System.out.println("result="+result2);
		System.out.println("result="+result4);
		System.out.println("result="+result3);



	}
}