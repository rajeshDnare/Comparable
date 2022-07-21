package practice02main;

public class family implements Comparable<family>{
	String name;
	int age;
	
	public family(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(family o) {
		
		return (this.name.compareTo(o.name));
	}
	
	

}
