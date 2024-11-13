package ch04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhoneReaderEx {

	public static void main(String[] args) throws IOException {
		BufferedReader fr = null;
		File f = new File("phone.txt");
		System.out.println(f.getPath()+"를  출력합니다.");
		fr = new BufferedReader(new FileReader(f));
		while(true) {
			String line = fr.readLine();
			if(line == null) // end of file
				break;
			System.out.println(line + "\n");
		}
		fr.close();
	}
}
