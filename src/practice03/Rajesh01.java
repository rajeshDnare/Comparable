package practice03;

public class Rajesh01 implements Comparable<Rajesh01>{
	
	String name;
	int age;
	
	public Rajesh01(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Rajesh01 o) {
		// TODO Auto-generated method stub
		if(this.age > o.age)
			return 1;
		else if(this.age<o.age)
			return -1;
		else
			return 0;
	}

}
