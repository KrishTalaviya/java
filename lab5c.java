class Member{
	String name;
	int age;
	int Ph;
	String add;
	int salary;
	void printsalary(int salary){
		System.out.print(salary);
	}
	
	
}
class Employee extends Member{
	String sp;
	Employee(String n,int ag,int p,String a,int sa,String spe){
		name=n;
		age=ag;
		Ph=p;
		add=a;
		salary=sa;
		sp=spe;
	}
	void printdetails(){
		System.out.print(name);
	    System.out.print(age);
	    System.out.print(Ph);
	    System.out.print(add);
	    System.out.print(salary);
	    System.out.print(sp);
	}
}
class Manager extends Member{
	String dep;
	Manager(String n,int ag,int p,String a,int sa,String d){
		name=n;
		age=ag;
		Ph=p;
		add=a;
		salary=sa;
		dep=d;
	}
	void printdetails(){
		System.out.print(name);
	    System.out.print(age);
	    System.out.print(Ph);
	    System.out.print(add);
	    System.out.print(salary);
	    System.out.print(dep);
	}
}

class Main{
	public static void main(String[] args) {
		Employee obj1=new Employee("Abc",16,234,"asdf",2400,"Ce");
	  	obj1.printdetails();
	  	Member obj=new Member();
	  	obj.printsalary(2400);
	  	Manager obj2=new Manager("Abc",16,234,"asdf",2400,"CSE");
	  	obj2.printdetails();
	  	
	  	
		
	}
}