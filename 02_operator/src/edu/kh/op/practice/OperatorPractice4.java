package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		int sum = input1 + input2 + input3;
		double avr = sum/3;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f \n" ,avr);
		
		String result = avr >= 60 ? "합격" : "불합격";
		System.out.println(result);
				

	}

}
