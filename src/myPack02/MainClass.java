package myPack02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClass implements Comparable<MainClass>{
	String name;
	int age;
	
	public MainClass(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		MainClass a = new MainClass("yogesh", 45);
		MainClass b = new MainClass("akash", 35);
		MainClass c = new MainClass("himesh", 65);
		MainClass d = new MainClass("kalpesh", 75);
		
		
		
		LinkedList<MainClass> list=new LinkedList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		Collections.sort(list);
		
		Iterator<MainClass> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}
	}

	@Override
	public int compareTo(MainClass o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	

}
