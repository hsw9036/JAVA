package ch03;

import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		String c;
		try {
			fout = new FileWriter("c://temp//Phone.txt");
			while (true) {
				String line = s.nextLine();
				if(line.length() == 2)
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		} catch (IOException e) {
			
			System.out.println("입출력 오류");
		}
		s.close();
	}
}
//		File src = new File ( "c://Windows//Web//Wallpaper//Theme1//img1.jpg");
//		File dest = new File ("c://Temp//desert.jpg");
//		try {
//			FileInputStream fi = new FileInputStream(src);
//			FileOutputStream fo = new FileOutputStream(dest);
//			byte [] buf = new byte [1024*10];
//			while (true) {
//				int n = fi.read(buf);
//				fo.write(buf,0,n);
//				if(n <buf.length)
//					break;
//			}
//			fi.close();
//			fo.close();
//			System.out.println(src.getPath() + "를" + dest.getPath() +"로 복사하였습니다.");
//			
//		} catch(IOException e) {System.out.println("파일 복사 오류"); }
