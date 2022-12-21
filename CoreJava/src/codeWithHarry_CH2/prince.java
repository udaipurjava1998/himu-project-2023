package codeWithHarry_CH2;

public class prince {
	int a;
	
	int b;
	public String insert(int a, int b)
	{
		this.a=a;
		this.b=b;
		return null;
		
		
	}
	void insert1() {
		
	}
	
	@Override
	public String toString() {
		return "prince [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		prince p = new prince();
		p.insert(1, 2);
		System.out.println(p);
	}

}
