package ch03;

class D1 {
	public int x = 1000;
	public void display() {
		System.out.println("상위 클래스 디원의 디스플레이 메소드입니다");
	}
}

class D2 extends D1 {
	public int x = 2000;
	public void display() {
		System.out.println("하위 클래스 디투의 디스플레이 메소드입니다");
	}
	public void write () {
		display();
		super.display();
		System.out.println("디투 클래스 객체의 엑스값 : " + x);
		System.out.println("디원 클래스 객체의 엑스값 : " + super.x);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		D2 d = new D2();
		d.write();

	}

}
