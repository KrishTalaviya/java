public class Main {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
					}
		  for(int j=1;j<=i;j++){
		  	System.out.print("* ");
		  	 }
		System.out.println();
		}
		//reverse loop//
		for(int i=2;i>=1;i--){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
					}
		  for(int j=1;j<=i;j++){
		  	System.out.print("* ");
		  	 }
		System.out.println();
		}
		
	}
}