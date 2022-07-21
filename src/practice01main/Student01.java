package practice01main;

public class Student01 implements Comparable<Student01> {

	int marks;

	public Student01(int marks) {
		super();
		this.marks = marks;
	}


	@Override
	public int compareTo(Student01 o) {
		if(this.marks>o.marks)
			return 1;
		else if(this.marks<o.marks)
			return -1;
		else
			return 0;
			
	}

}
