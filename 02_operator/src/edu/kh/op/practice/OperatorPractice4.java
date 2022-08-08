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
		
		//합계를 저장하기 위한 변수
		int sum = input1 + input2 + input3;
		
		//평균을 저장하기 위한 변수
		double avg = sum/3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f \n" ,avg);
		
		String result = input1 >= 40 
				&& input2 >= 40 
				&& input3 >= 40 
				&& avg >= 60 ? 
				"합격" : "불합격";
				
		System.out.println(result);
				
	}

}
