package practice01main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		Student01 a = new Student01(52);
		Student01 b = new Student01(56);
		Student01 c = new Student01(84);
		Student01 d = new Student01(96);
		Student01 e = new Student01(46);
		Student01 f = new Student01(75);
		
		ArrayList<Student01> al=new ArrayList<Student01>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		al.add(f);
		
		Collections.sort(al);
		
		Iterator<Student01> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().marks);
		}
				
	}

}
