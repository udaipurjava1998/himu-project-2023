package codeWithHarry_CH2;

public class abc {
 
	String name;
	int no;
	
	public void setdata (String name,int no) {
		this.name = name;
		this.no = no;
		
	}
	public void display() {
		System.out.println("this is :-" +name+"  "+no);
	}
	
//	public String toString () {
//		return "Name is "+ name + " No is " + no;
//	}
	
	class xyz{
		public static void main(String[] args) {
			abc a = new abc(); 
			a.setdata("himanshu", 122);
			a.display();
		
		}
	}
}
