import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        double hr=sc.nextInt();
       double min=sc.nextInt();
        double sum=min/5;
        double diff=hr-sum;
        if(diff<0){
        	diff=diff*(-1);
        }
        double min2=min*(.5);
         double angel=diff*30;
         if(angel<0){
         	angel=angel*(-1);
         }
         double fangle=angel-min2;
        Ssytem.out.print("angle"+fangle);
		
	}
}