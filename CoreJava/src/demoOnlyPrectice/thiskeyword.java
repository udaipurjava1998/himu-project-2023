package demoOnlyPrectice;

class person {
	String name;
	int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class thiskeyword {

	public static void main(String[] args) {
		person p = new person();
		p.setName("himanshu");
		p.setAge(24);
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
