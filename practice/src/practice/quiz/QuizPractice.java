package practice.quiz;

import java.util.Scanner;

public class QuizPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			
			for(int x=1; x<=num; x++) {
				
				if(i==1 || i==num || x==1 || x==num ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 
			System.out.println();
		}
		
		
	}
			

}
