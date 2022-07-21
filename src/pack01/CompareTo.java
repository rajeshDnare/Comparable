package pack01;

import java.util.TreeSet;

public class CompareTo implements Comparable {
	int rollNo;
	String name;

	public CompareTo(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;

	}
	public void display() {
		System.out.println(rollNo);
		System.out.println(name);
	}
	public static void main(String[] args) {
		CompareTo a1 = new CompareTo(111, "Rajesh");
		CompareTo a2 = new CompareTo(222, "Vedant");

//		a1.display();
//		a2.display();
		
		int f=a1.name.compareTo(a2.name);
		System.out.println(f);
		
		TreeSet ts=new TreeSet<>();
		ts.add(a1.rollNo);
		ts.add(a2.rollNo);
		System.out.println(ts); 

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}

	
}
