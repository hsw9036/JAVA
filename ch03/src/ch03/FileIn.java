package ch03;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileIn {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.println("읽어 들1 파1명을 입력해보소 : ");
		String g = s.next();
		FileReader fr = new FileReader(g);
		int i;
		
		while (( i = fr.read ()) !=-1 ) {
			System.out.print((char)i);
		}

		fr.close();
	}

}
