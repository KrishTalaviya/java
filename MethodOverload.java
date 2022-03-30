
class MethodOverload{
	//method overloading with changing parameters//
	public  int add(int a,int b){
		int sum=0;
		sum=a+b;
		return sum;

	}
	public int add(int a,int b,int c){
		int sum=0;
		sum=a+b+c;
		return sum;
	}
	// method overloading with changing datatypes//
	public int sub(int a, int b){
		int sum=a-b;
		return sum;

	}
	public double sub(double x,double y){
		double sum=x-y;
		return sum;
	}
}