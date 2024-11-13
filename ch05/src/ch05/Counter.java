package ch05;

class Counte {
	int count = 0;
	public void increment () {
		count ++;
	}
	
	public void decrement () {
		count --;
	}
	
	public int getCount() {
		return count;
		
		
		public void run() {
			for(int i=0 ; i<50; i++) {
			increment();
			decrement();
			System.out.println("응애");
		}
	}
}


public class Counter {
	
	Counte cnt = new Counte();

	public static void main(String[] args) {
		Counte cnt = new Counte();
		cnt.start();

	}

}
