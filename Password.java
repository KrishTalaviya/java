import java.util.Scanner;
class Password{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your password");
		String str=sc.nextLine();
		String str2="123456@abc";
		if (str.equals(str2)) {
			System.out.println("Welcome");
			
		}
		else{
			System.out.println("password is not valid");
		}

	}

}