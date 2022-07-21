package practice04;

public class class01 implements Comparable<class01>{
	int n;
	
	public class01(int n){
		this.n=n;
		
	}

	@Override
	public int compareTo(class01 o) {
		// TODO Auto-generated method stub
		if(this.n > o.n)
			return -1;
		else if(this.n<o.n)
			return 1;
		else 
			return 0;
	}

}
