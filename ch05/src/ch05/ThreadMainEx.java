package ch05;

public class ThreadMainEx {

	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		System.out.println("현재 스레기 이름 = " + name );
		System.out.println("현재 쓰레기 아이디 = " + id);
		System.out.println("현재 쓰레기 우선순위 값 = " + priority);
		System.out.println("현재 쓰레기 상태 = " + s );

	}

}
