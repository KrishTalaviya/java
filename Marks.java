import java.util.*;
public  class Marks
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Maths mark");
		int math=sc.nextInt();
		System.out.print("enter phyiscs mark");
		int phy=sc.nextInt();
		System.out.print("enter chemistry mark");
		int chem=sc.nextInt();
		System.out.print("enter english mark");
		int eng=sc.nextInt();
		System.out.print("enter computer mark");
		int comp=sc.nextInt();
		int per=(math+phy+chem+eng+comp)/5;
		System.out.println(per);
		if (per<40)
		 {
			System.out.println("fail");
		 }
		 else if (per>=40 && per<50) 
		 {
		 	System.out.println("third class");
		 }
		 else if (per>=50 && per<60) 
		 {
		 	System.out.println("second class");
		 }
		 else  
		 {
		 	System.out.println("second class");
		 }



	}
}