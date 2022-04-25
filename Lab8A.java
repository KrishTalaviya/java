public class Lab8A{
	static void multi(int x,int y){

		int ans=x*y;
		System.out.println(ans);
	}
public static void main(String[] args) {
	double ans=0;
	int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);

	try{
		multi(x,y);
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println(e);
	}
}
}