package pack02;

import java.util.Iterator;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		parent rajesh=new parent(38);
		parent ankita=new parent(28);
		parent sangita=new parent(18);
		parent savita=new parent(8);
		
		TreeSet<parent> ts=new TreeSet();
		ts.add(rajesh);
		ts.add(ankita);
		ts.add(sangita);
		ts.add(savita);
		
		Iterator<parent> itr=ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().age);
			
		}

	}

}
