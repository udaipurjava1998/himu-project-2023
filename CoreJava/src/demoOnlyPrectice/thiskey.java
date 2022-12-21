package demoOnlyPrectice;

class Ekclass {
	int a;

	
	//getter 
	public int getA() {
		return a;
	}

	// custructor (the custructor and class name are some )
	Ekclass(int v) {
		this.a = v;
		
	}

	// method
	public int returnone() {
		return 1;
	}
}

// second class 
class doclass extends Ekclass{
	doclass(int c){
		super(c);
		System.out.println("me ek cons. hu ");
	}
}

public class thiskey {

	public static void main(String[] args) {
		Ekclass ek = new Ekclass(5);
	    doclass dc	= new doclass(65);
		System.out.println(ek.getA());
		System.out.println(dc.getA());
		
	}

}
