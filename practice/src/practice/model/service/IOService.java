package practice.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IOService {

	public void fileCopy() {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.print("복사할 파일 경로: ");
			String input = sc.nextLine();
			
			bis = new BufferedInputStream(new FileInputStream(input));
			
			System.out.print("복사할 위치 + 파일 명: ");
			String output = sc.nextLine();
			
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			int value = 0;
			
			while(true) {
				value = bis.read();
				if(value == -1) break;
				
				bos.write(value);
				
			}
			
			System.out.println("복사 완료");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			System.out.println("오류 발생");
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
