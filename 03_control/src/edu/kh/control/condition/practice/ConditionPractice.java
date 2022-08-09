package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	
	
	
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num > 0) {
			if(num % 2 ==0) {
				result = "짝수입니다";
			}else {
				result = "홀수입니다.";
			}
		} else {
			result = "양수만 입력해주세요.";
		}
		
		System.out.println(result);
			
	}
	
	
	
	
	
	
	
	public void practice2() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		
		if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.printf("국어 : %d \n"
					+ "수학 : %d \n"
					+ "영어 : %d \n"
					+ "합계 : %d \n"
					+ "평균 : %.1f \n"
					+ "축하합니다, 합격입니다! \n",kor,math,eng,sum,avg);
		} else {
			System.out.println("불합격입니다. \n");
		}
		
		
	}
	
	
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
//		30일 : 4, 6, 9, 11
//		31일 : 1, 3, 5, 7, 8, 10, 12
//		28일 : 2
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다.");
			break;
		
		default : System.out.println(month + "월은 잘못 입력된 달 입니다.");
		}
		
	}
	
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi >= 30) {
			result = "고도비만";
		} else if (bmi >= 25) {
			result = "비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		
		System.out.printf("BMI 지수 : %f \n%s \n",bmi, result);
		
	}
	
	
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
//		int로 입력 받아도 대입 연산시 double로 자동 형변환
		System.out.print("중간 고사 점수 : ");
		double midterm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		double finals = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double attend = sc.nextInt();
		
		
		System.out.print("중간고사 반영 비율(0.1~1 사이값) : ");
		double persent1 = sc.nextDouble();
		
		System.out.print("기말고사 반영 비율(0.1~1 사이값) : ");
		double persent2 = sc.nextDouble();
		
		System.out.print("과제 반영 비율(0.1~1 사이값) : ");
		double persent3 = sc.nextDouble();
		
		System.out.print("출석 반영 비율(0.1~1 사이값) : ");
		double persent4 = sc.nextDouble();
		
		if(persent1+persent2+persent3+persent4 != 1) {
			System.out.println("반영 비율이 1을 넘겼습니다.");
		} else {	
//		각각의 점수를 비율에 맞게 변경
			midterm *= persent1; //midterm = midterm * 0.2;
			finals *= persent2;
			report *= persent3;
			attend = (attend/20.0*100) * persent4;
			double sum = midterm + finals + report + attend;		
			
			if (attend <= 14) {
				System.out.printf("\n=============== 결과 ================\n"
						+ "중간 고사 점수(20) : %.1f \n"
						+ "기말 고사 점수(30) : %.1f \n"
						+ "과제 점수     (30) : %.1f \n"
						+ "출석 횟수     (20) : %.1f \n"
						+ "총점 : %.1f \n"
						+ "Fail [출석 횟수 부족 (%.0f/20)] \n",
						midterm, finals, report, attend, sum, attend);
			} else if (sum < 70) {
				System.out.printf("\n=============== 결과 ================\n"
						+ "중간 고사 점수(20) : %.1f \n"
						+ "기말 고사 점수(30) : %.1f \n"
						+ "과제 점수     (30) : %.1f \n"
						+ "출석 횟수     (20) : %.1f \n"
						+ "총점 : %.1f \n"
						+ "Fail [점수 미달] \n",
						midterm, finals, report, attend, sum);
			}else {
				System.out.printf("\n=============== 결과 ================\n"
						+ "중간 고사 점수(20) : %.1f \n"
						+ "기말 고사 점수(30) : %.1f \n"
						+ "과제 점수     (30) : %.1f \n"
						+ "출석 횟수     (20) : %.1f \n"
						
					+ "총점 : %.1f \n"
					+ "PASS \n",
					midterm, finals, report, attend, sum);
			}
		
		}
		
	}

	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		int result;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
			result = 31;
			break;
		case 4: case 6: case 9: case 11:
			result = 30;			
			break;
		case 2:
			result = 28;
			
		default : result = -1;
		}
		
		if(result == -1) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d월은 %s일 까지 있습니다.", month, result);			
		}
		
		
	}
}
