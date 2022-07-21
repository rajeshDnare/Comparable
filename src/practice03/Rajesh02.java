package practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Rajesh02 {
	public static void main(String[] args) {
		
	
	Rajesh01 a=new Rajesh01("don", 35);
	Rajesh01 b=new Rajesh01("dan", 40);
	Rajesh01 c=new Rajesh01("moon", 20);
	Rajesh01 d=new Rajesh01("aash", 15);
	Rajesh01 e=new Rajesh01("kim", 19);
	Rajesh01 f=new Rajesh01("jong", 55);
	
	ArrayList<Rajesh01> al=new ArrayList<Rajesh01>();
	al.add(a);
	al.add(b);
	al.add(c);
	al.add(d);
	al.add(e);
	al.add(f);
	
	Collections.sort(al);
	
	Iterator<Rajesh01> itr=al.iterator();
	while(itr.hasNext())
		System.out.println(itr.next().name);
	
	
	}

}
