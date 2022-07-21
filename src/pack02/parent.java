package pack02;

import java.util.Comparator;

public class parent implements Comparable<parent> {
	int age;

	public parent(int age) {
		super();
		this.age = age;
	}

	@Override
	public int compareTo(parent o) {
		if (this.age < o.age)
			return -1;
		else if (this.age > o.age)
			return 1;
		else
			return 0;
	}
	
	

	

}
