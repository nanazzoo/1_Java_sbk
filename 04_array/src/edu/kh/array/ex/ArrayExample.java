package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	/* 배열 (자료구조)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고
	 * 	 각 변수들은 index를 이용하여 구분함.
	 * 
	 */
	
	
	public void ex1() {
//		배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		int sum1 = num1 + num2 + num3+ num4;
		
		System.out.println(sum1);
		
		
		System.out.println("====================================");
		
//		배열 이용
		
		int[] arr = new int[4];  // []: 배열 기호
//		int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고 이를 'arr'이라고 부름
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum2 = 0;
		
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]);
			
			sum2 += arr[i];
			
		}
		System.out.println(sum2);
			
		
	}

	
	
	
	
	
	public void ex2() {
		
//		int[]을 참조하는 변수 arr 선언
		int[] arr; //배열 시작 주소를 저장하는 변수(참조형, 4byte)
		
		
		arr = new int[4];
//		Heap 영역에 int 4칸 짜리 배열을 할당(생성)하고
//		할당 된 배열의 시작 주소를 arr에 대입
		
//		배열 길이(크기): 4
		System.out.println("배열 길이: " + arr.length);
		
		System.out.println("컴파일러가 정말로 0으로 다 초기화 해줬을까?");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
//		Stack 영역은 컴파일러가 알아서 초기화 X
//		heap  영역은 컴파일러가 알아서 초기화 O
//		int a;
//		System.out.println(a);
//		The local variable a may not have been initialized(초기화x)
		
		
		
		
		System.out.println("============================================");
		
		
		
		
//		배열 초기화
		
		
//		1) 인덱스를 이용한 초기화
			arr[0] = 100; //arr int[] 참조형 변수가 참조하고 있는 배열의 
//			                0번 인덱스에 100을 대입
			arr[1] = 200;
			
			arr[2] = 300;
			
			arr[3] = 400;
		
			
//			*for문을 이용한 배열에 저장된 모든 값 출력
			for(int i=0; i<arr.length; i++) {
				System.out.printf("arr[%d] = %d \n", i, arr[i]);
			}
			
			
		System.out.println("=======================================");
		
//		2) for문을 이용한 초기화
//			-> 배열의 각 인덱스에 대입되는 값이 일정한 규칙성이 있을 경우 사용
		
//			int 10개를 저장하는 배열의 각 요소에
//			10, 20, 30 ~ 100 까지 대입
			
			int[] arr2 = new int[10]; //index 0 ~ 9
			
			for(int i=0; i<arr2.length; i++) {
				
				arr2[i] = 10*(i+1);		
			}
			
//			출력
			for(int i=0; i<arr2.length; i++) {
				System.out.printf("arr[%d] = %d \n", i, arr2[i]);
			}
		
		
		
	}
	
	
	
	
	
	public void ex3() {
//		2) for문을 이용한 초기화
		
//		5명의 키(cm)를 입력 받고 평균 구하기
		
		// 1번 키 입력 : 170.5
	    // 2번 키 입력 : 165.7
	    // 3번 키 입력 : 184.3
	    // 4번 키 입력 : 190.2
	    // 5번 키 입력 : 174.4
	      
	    // 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4
	    // 평균 : 177.02cm
		
		
		Scanner sc = new Scanner(System.in);
		
		double[] heightArr = new double[5];
		
		
		for(int i=0; i<heightArr.length; i++) {
			System.out.print((i+1) + "번 키 입력: ");
			heightArr[i] = sc.nextDouble();		
		}
		
//		배열에 저장된 모든 값을 한 줄로 간단히 출력
//		System.out.println(Arrays.toString(heightArr));
		
		System.out.println();//줄바꿈
		
		double sum = 0; //합계 (평균 구할 때 사용)
		
		System.out.print("입력 받은 키: ");
		
		for(int i=0; i<heightArr.length; i++) {
			sum+=heightArr[i];	
			System.out.print(heightArr[i] + " ");
		}
		System.out.printf("\n평균 : %.2fcm", sum/heightArr.length);
		
	}
	
	
	
	
	
	public void ex4() {
//		ArrayIndexOutOfBoundsException: 배열 인덱스 범위 초과
//		index보다 더 긴 범위의 구문 작성
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
	}
	
	
	
	
	
	public void ex5() {
//		3) 배열 선언과 동시에 (할당 및) 초기화
		
		int[] arr = {10, 20, 30, 40};
//		->
//		1. int[]을 참조하는 변수 arr 선언
//		2. int형 4칸짜리 배열을 heap 영역에 할당(생성)
//		   각각의 인덱스를 10, 20, 30, 40으로 초기화
//		3. 할당된 배열의 시작 주소를 arr 변수에 대입
		
		System.out.println("배열 길이: " + arr.length);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
		
		
	
		
	public void ex6() {
	//		점심 메뉴 뽑기 프로그램
		
		String[] menuArr = {"김밥+라면", "KFC", "맘스터치", "써브웨이", 
				"백반", "순대국", "곰탕", "파스타", "쉐이크", "삼겹살"};
		
	//		배열 index 범위 내 난수 발생
		int ran = (int)(Math.random()*menuArr.length);
		
		System.out.println("오늘의 점심 메뉴: " + menuArr[ran]);
		
	}
	

	
	/////////////////////////////////배열 응용///////////////////////////////////
	
	public void ex7() {
		
//		인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당
//		인원 수 만큼 점수를 입력 받아 
//		합계, 평균, 최고점, 최저점을 출력
		
		// ex)
	      // 입력 받을 인원 수 : 4
	      // 1번 점수 입력 : 100
	      // 2번 점수 입력 : 80
	      // 3번 점수 입력 : 50
	      // 4번 점수 입력 : 60
	      
	      // 합계 : 290
	      // 평균 : 72.5
	      // 최고점 : 100
	      // 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수: ");
		int size = sc.nextInt();
		
		int[] scoreArr = new int[size];
		
		int sum = 0;
		
		for(int i=0; i<scoreArr.length; i++) {
			System.out.print((i+1) + "번 점수 입력: ");
			scoreArr[i] = sc.nextInt();
			
			sum+=scoreArr[i];
		}
		System.out.println();
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum/scoreArr.length);
		
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
