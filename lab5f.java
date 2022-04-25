class Lab_5countobj{
	static int count=0;
	Lab_5countobj(){
		
		count++;
		System.out.println("counter="+count);

	}
	public static void main(String[] args) {
		Lab_5countobj obj1=new Lab_5countobj();
		Lab_5countobj obj2=new Lab_5countobj();

	}
}