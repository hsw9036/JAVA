package ch04;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("phone.txt");
		try {
			fw = new FileWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.println("이름 전화번호 >>");
				String line = sc.nextLine();
				if(line.equals("그만"))
					break;
				fw.write(line + "\r\n");
			}
			System.out.println(f.getPath() + " 에 저장되었습니다. ");
			sc.close();
			fw.close();
		} catch(Exception e){
			
		}

	}

}
