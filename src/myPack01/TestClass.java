package myPack01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
		
		ComparatorTest a=new ComparatorTest("Rajesh");
		ComparatorTest b=new ComparatorTest("Ankita");
		ComparatorTest c=new ComparatorTest("Vedant");
		ComparatorTest d=new ComparatorTest("Riyansh");
		ComparatorTest e=new ComparatorTest("Vaishnav");
		
		ArrayList<ComparatorTest> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		
		Collections.sort(al);
		
		Iterator<ComparatorTest> itr=al.iterator();
		while (itr.hasNext()) {
			ComparatorTest comparableClass = (ComparatorTest) itr.next();
			System.out.println(comparableClass.name);
		}

	}

}
