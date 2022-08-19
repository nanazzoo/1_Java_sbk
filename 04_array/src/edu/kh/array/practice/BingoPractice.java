package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BingoPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void bingo() {
		
//		변수 선언부
		int bingoSize = 0;
		int count = 0;
		int num = 0;
		String input = "";
		boolean flag1 = true;
		int star = 0;
		
		System.out.print("빙고판 크기 지정: ");
		bingoSize = sc.nextInt();
		
//		빙고게임용 2차원 배열 선언
		String[][] arr = new String[bingoSize][bingoSize];
		
		
//		중복 제거용 1차원 배열 선언
		int[] arr1 = new int[bingoSize*bingoSize];
		
		
//		1차원 배열 중복 제거
		for(int i=0; i<arr1.length; i++) {
			
			int ran = (int)(Math.random()*(bingoSize*bingoSize)+1);
			arr1[i] = ran;
			
			for(int x=0; x<i; x++) {
				if(arr1[x] == arr1[i]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++ ) {
			for(int x=0; x<arr[i].length; x++) {
				arr[i][x] = Integer.toString(arr1[num]);
				num++;
				
				System.out.printf("%4s", arr[i][x]);
				if(x == arr[i].length-1) {
					System.out.println();
				}
			}
		}
		
		
		System.out.println("=============빙고게임 시작=============");
		while(count != 3) {
			
			System.out.print("정수를 입력하시오: ");
			input = sc.next();
			
			boolean flag = true;
			
			for(int row=0; row<arr.length; row++) {
				for(int col=0; col<arr[row].length; col++) {
					
					if(arr[row][col].equals(input)) {
						arr[row][col] = "*"; 
						flag = false;
					}
				}
			}
			if(flag) {
				System.out.println("다시 입력해주세요.");
			}
			
			for(int i=0; i<arr.length; i++ ) {
				for(int x=0; x<arr[i].length; x++) {					
					System.out.printf("%4s", arr[i][x]);
					if(x == arr[i].length-1) {
						System.out.println();
					}
				}
			}
			
			
			
			
			for(int row=0; row<1; row++) {
				for(int col=0; col<arr[row].length-1; col++) {
					if(arr[0][0].equals("*")) {
						
					}
				}
				
			System.out.println(count);
				if(star == 5) {
					count++;
				}
			
			}
		}
		
		
			
		
		System.out.println("***** BINGO!!! *****");
		
	}


}
