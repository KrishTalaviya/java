import java.util.*;
class Book{
	private String author_name;
	Book(String author_name){
		this.author_name=author_name;
     }
    void display(){
    	System.out.println("parent authorname="+author_name);
    }
}
class BookPublication extends Book{
	private String title;
	BookPublication(String title){
		super("child author publish");
		this.title=title;
	}
	void display(){
		System.out.println("publish title="+this.title);
	}
}
class PaperPublication extends Book{
	private String title;
	PaperPublication(String title){
		super("child author paper publish");
		this.title=title;
	}
	void display(){
		System.out.println("publish paper title="+this.title);
	}
}
class BookDemo{
	public static void main(String[] args) {
		if(args[0].equals("Book")){
            BookPublication b=new BookPublication("ansci");
            b.display();
		}
		 else if(args[0].equals("paper")){
            PaperPublication p=new PaperPublication("java");
            p.display();
		}
		else{
			Book obj=new BookPublication("abc");
			obj.display();
		}
		
	}
}