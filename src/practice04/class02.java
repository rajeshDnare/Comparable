package practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class class02 {
	
	public static void main(String[] args) {
		
		
		class01 a=new class01(10);
		class01 b=new class01(200);
		class01 c=new class01(30);
		class01 d=new class01(40);
		class01 e=new class01(500);
		
		ArrayList<class01> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		
		Collections.sort(al);
		
		Iterator<class01> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().n);
		
	}

}
