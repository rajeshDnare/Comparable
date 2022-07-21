package myPack01;

public class ComparatorTest implements Comparable<ComparatorTest> {
	String name;

	public ComparatorTest(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(ComparatorTest o) {
		return this.name.compareTo(o.name);
	}

}
