package ch03;

class OIa {
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 쇼 수행 " +str);
	}
}

class OIb extends OIa {
	public void shaw(String str) {
		System.out.println("하위 클래스의 메소 쇼 수행 " + str);
	}
}

public class OverridingTest3 {

	public static void main(String[] args) {
		OIb oib = new OIb();
		oib.show("처 시 자");

	}

}
