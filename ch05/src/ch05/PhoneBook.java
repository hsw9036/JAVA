package ch05;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//자 일단 a랑 b를 받아야되잖아???
	
	
	//받았지 ? 스캐너에 집어넣은거잖아 그런다음에 a랑 b를 더해야돼
	while(true) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( a == 0 && b == 0 ) {
			break;
		}
	System.out.println(a + b);
	}
	
//	for (int i = 1; i < 10 ; i ++) 
//		
//	System.out.println(a + " * " + i + " = " + a * i);
//		
	}
}





//int H = sc.nextInt(); // 처음 시간
//int M = sc.nextInt(); // 처음 분
//int PM = sc.nextInt(); // 추가분 (분단위로 입력)
//
//M = M+PM ;
//
//if ( M >= 60 ) {
//	H = H + M / 60;
//	M = M%60 ;
//}
//
//if ( H >=24 ) {
//	H=H%24;
//}

//import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Scanner;
//
//class Phone {
//	private String name;
//	private int number;
//	public Phone(String name, int number) {
//		this.name = name;
//		this.number = number;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//}
//
//
//
//
//public class PhoneBook {
//	
//	Scanner sc = new Scanner (System.in);
//	HashMap<String, Phone> map = new HashMap<String, Phone>();
//	
//	while(true) {
//		sysout
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
//class Phone {
//	private String name;
//	private String tel;
//	public Phone(String name, String tel) {
//		this.name = name;
//		this.tel = tel;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//}
//
//public class PhoneBook {
//	
//	Scanner sc = new Scanner (System.in);
//	Phone[] pArray;
//	
//	void read() {
//		System.out.println(" 인원수 >> ");
//		int n = sc.nextInt();
//		
//		pArray = new Phone[n];
//		
//		for(int i = 0 ; i < pArray.length; i ++) {
//			System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력) >> ");
//			String name = sc.next();
//			String tel = sc.next();
//			pArray[i] = new Phone(name, tel);
//		}
//		System.out.println("저장 완료");
//	}
//	
//	String search(String name) {
//		for(int i = 0 ; i < pArray.length; i++) {
//			if(pArray[i].getName().equals(name))
//				return pArray[i].getTel();
//		}
//		return null;
//	}ㅋ
//	
//	void run() {
//		read();
//		while(true) {
//			System.out.println("검색할 이름 >> ");
//			String name = sc.next();
//			if(name.equals("그만"))
//					break;
//			String tel = search(name);
//			if(tel == null)
//				System.out.println(name + "값이 없습니다.");
//			else
//				System.out.println(name + "번호는" + tel + "입니다");
//		}
//	}
//	
//	public static void main(String[] args) {
//		new PhoneBook().run();
//		
//		
//	}
//}
