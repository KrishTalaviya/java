interface EventListner{
	public void performEvent();
}
interface MouseListner extends EventListner{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();

}
interface KeyListner extends EventListner{
	public void keyReleased();
	public void keyPressed();
	

}
class EventDemo implements KeyListner,MouseListner{
	public void performEvent(){
       System.out.println("performevent method");
	}
	public void mouseClicked(){
       System.out.println("mouseClicked method");
	}
	public void mouseMoved(){
       System.out.println("mousemoved method");
	}
	public void mousePressed(){
       System.out.println("mousePressed method");
	}
	public void mouseReleased(){
       System.out.println("mouseReleased method");
	}
	public void mouseDragged(){
       System.out.println("mouseDragged method");
	}
	public void keyPressed(){
       System.out.println("keypressed method");
	}
	public void keyReleased(){
       System.out.println("keyReleased method");
	}


}
class ListnerA{
	public static void main(String[] args) {
		EventDemo obj=new EventDemo();
		obj.mouseClicked();
		obj.mousePressed();
		obj.mouseReleased();
		obj.mouseMoved();
		obj.mouseDragged();
		obj.performEvent();
		obj.keyReleased();
		obj.keyPressed();

}
}
