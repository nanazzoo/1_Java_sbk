package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
//	실습문제 1
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		if(input < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
				for(int i=1; i<=input; i++) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		if(input < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
				for(int i=input; i>=1; i--) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			
			if(i == input) {
				System.out.print(i);		
			} else {
				System.out.print(i + " + ");			
			}
			sum += i;
		}
		
		System.out.print(" = " + sum);
		
		
		
	}
	
	
	
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		
//			방법1
//			if(num1<1 || num2<1) {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//			}else {
//				
//				if(num1<num2){
//					for(int i=num1; i<=num2; i++ ) {
//						System.out.print(i + " ");
//					}
//				}else {
//					for(int i=num2; i<=num1; i++ ) {
//						System.out.print(i + " ");
//					}
//					
//				}
//			}
		
		
//			방법2
//			if(num1<1 || num2<1) {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//				
//			}else { 
//				
//				int start = num1;
//				int end = num2;
//				
//				if(num1 > num2) {
//					start = num2;
//					end = num1;
//				}
//				
//				for(int i = start; i<=end; i++) {
//					System.out.print(i + " ");
//					
//				}
//				
//			}
		
		
//			방법3
			if(num1<1 || num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				
			}else { 
				
				
//				    8      4
				if(num1 > num2) {
//					두 변수의 값 교환
					int temp = num1; //temp: 8/ num1: 8/ num2: 4
					num1 = num2;     //temp: 8/ num1: 4/ num2: 4
					num2 = temp;     //temp: 8/ num1: 4/ num2: 8
				}
				
				for(int i = num1; i<=num2; i++) {
					System.out.print(i + " ");
					
				}
				
			}
			
	}
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		
		System.out.printf("======= %d단 ======= \n", dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n",dan,i,dan*i);
		}			
		
		
		
	}
	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		
		if(dan>9 || dan<2) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			
			for(int x=dan; x<=9; x++) {
				System.out.printf("======= %d단 ======= \n", x);
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %2d \n",x,i,x*i);
				}	
				System.out.println();
			}
					
		}
	
	}
	
	
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		
		for(int x=1; x<=input; x++) {
			for(int i=1; i<=x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
	
	
	
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		
		for(int x=input; x>=1; x--) {
			for(int i=x; i>=1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		
//		for문을 이용한 풀이
//		for(int x=1; x<=input; x++) {
//			for(int y=input-1; y>=row; y--) {
//			for(int y=input-x; y>=1; y--) {
//				System.out.print(" ");
//			}
			
//			for(int i=1; i<=x; i++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
//		if문을 이용한 풀이
		for(int x=1; x<=input; x++) {
			
			for(int i=1; i<=input; i++) {
				
				if(i <= input-x) {
					System.out.print(" ");			
				} else {
					System.out.print("*");				
				}
				
			}
			
			System.out.println();			
		}
		
	}
		
		
	
	
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		
//		방법1
//		위쪽 삼각형
		for(int x=1; x<=input; x++) {
			
			for(int i=1; i<=x; i++) {
				System.out.print("*");	
			} 
			System.out.println();		
		} 
		
//		아래쪽 삼각형
		for(int x=input-1; x>=1; x--) {
			for(int i=x; i>=1; i--) {
				System.out.print("*");						
			}
			System.out.println();
		}
		
		
		System.out.println("=======================================");
		
//		방법2
//		for(int row=1; row<=input*2-1; row++) {
//			
//			if(row<input) {
//				for(int col=1; col<=row; col++) {
//					System.out.print("*");
//				}	
//			} else {
//				for(int col=input; col>row-input; col--) {
//					System.out.print("*");
//				}
//			}
//			
//		}
		
		
		
	}
		
	
	
	
	public void practice11() {
		
//		   *
//		  ***
//		 *****
//		*******
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for(int x=1; x<=input; x++) {
			
			for(int y=input-x; y>=1; y--) {
				System.out.print(" ");
			}
			
			for(int i=1; i<=2*x-1; i++) {
				System.out.print("*");
			}
			System.out.println();				
		}
		
		
//		if문을 이용한 풀이
		for(int x=1; x<=input; x++) {
			
			for(int i=1; i<=input*2-1; i++) {
				
				if(input-x>=i || input+x<=i) {
					System.out.print(" ");			
				} else {
					System.out.print("*");				
				}
				
			}
			
			System.out.println();			
		}
			
	}
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
//		for(int x=1; x<=1; x++) {
//			
//			for(int i=1; i<=input; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			for(int j=1; j<=3; j++) {
//				for(int y=1; y<=1; y++) {
//					System.out.print("*");
//				}
//				
//				for(int h=1; h<=input-2; h++) {
//					System.out.print(" ");
//				}
//				
//				for(int s=1; s<=1; s++) {
//					System.out.print("*\n");
//				}
//					
//			}
//			
//			for(int i=1; i<=input; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		for(int row=1; row<=input; row++) {
			
			for(int col=1; col<=input; col++) {
//				첫 번째 / 마지막 줄, 칸일 때만 * 출력
				
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();			
		}
		
	}
	
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요: ");
		int input = sc.nextInt();
		
		int count = 0;

		for(int i=1; i<=input; i++) {
				
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				
				if(i%2==0 && i%3==0) {
					count++;
				}
			}
			
		}
		System.out.printf("\ncount: "+count);	
	}
	
	

	}
		
		
		



