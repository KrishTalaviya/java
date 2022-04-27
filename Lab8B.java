import java.util.Scanner;
public class Lab8B{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int[] n=new int[5];
		for(int i=0;i<5;i++)
		{
			 n[i]=sc.nextInt();
		}

	for(int i=0;i<5;i++){

		try{
			if(n[i]<0)
			{
				throw new Exception("enter positive number");
			}
			  if(n[i]%10==0){
				throw new Exception("enter number which is not divisible by 10");
			}
			  if (n[i]>1000&& n[i]<2000) {
				throw new Exception("enter suitable number ");
			}
			 if(n[i]>7000){
				throw new Exception("enter number less 7000");
			}
			else{
				sum=sum+n[i];
				
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
	
	System.out.println("summation="+sum);

		
	}

}