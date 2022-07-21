package practice02main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		
		family a=new family("rajesh", 38);
		family b=new family("rakesh", 35);
		family c=new family("sushma", 30);
		family d=new family("ankita", 28);
		
		ArrayList<family> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		
		
		Collections.sort(al);
		
		Iterator<family> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}
				
	}

}
