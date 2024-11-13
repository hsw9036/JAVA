package ch03;

class SB1 {
	public int x = 500;
	public int y = 1000;
}

class SB2 extends SB1 {
	public String x = "처 시 자 ";
	public String xx = x + super.x ;
	public String yy = ""+y+super.y;
}

public class SuperTest1 {

	public static void main(String[] args) {
		SB2 sb2 = new SB2() ;
		System.out.println("객체 sb2에 들어 있는 x,y값 :"+sb2.x + sb2.y);
		System.out.println("객체 sb2에 들어 있는 xx값 :"+sb2.xx);
		System.out.println("객체 sb2에 들어 있는 xy값 :"+sb2.yy);
		// TODO Auto-generated method stub

	}

}
