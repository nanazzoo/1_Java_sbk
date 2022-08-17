package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			
			if(i%2 == 0) {
				sum+=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합: " + sum);
	}
	
	
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = 9-i;
			System.out.print(arr[i] + " ");
			
			
			if(i%2 == 1) {
				sum+=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합: " + sum);
		
	}
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
		}

		
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("입력 " + i + ": ");
			arr[i] = sc.nextInt();
			
			}
			
		System.out.print("검색할 값: ");
		int search = sc.nextInt();

		for(int i=0; i<arr.length; i++) {
				if(search==arr[i]) {
					flag = false;
					System.out.println("인덱스: " + i);
					break;
				}
			}	
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] strArr = new char[str.length()];
		
		int count = 0;
		
		for(int i=0; i<strArr.length; i++) {
			
			strArr[i] = str.charAt(i);
			
		}
		
		System.out.print(str+"에 " +ch+ "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i] == ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\ni 개수 : " + count);
		
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n총 합: "+sum);
	}
	
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = str.charAt(i);
			if(i<8) {
				System.out.print(arr[i]);
			} else {
				System.out.print("*");			
			}
			
		}		
		
	}
	
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.print("정수: ");
			num = sc.nextInt();
			
			if(num<3 || num%2==0) {
				System.out.println("다시 입력하세요");
				continue;
			}			
			break;		
		}
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {	
			if(i<num-i+1) {
				arr[i] = i+1;	
			} else {
				arr[i] = num-i;
			}
		}
			
		
		for(int i=0; i<arr.length; i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i] +", ");	
			} else {
				System.out.print(arr[i] + " ");
			}		
		}
				
	}
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;			
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(max<arr[i]) {
				max = arr[i];
			}

			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n최댓값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}
	
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;	
			
			for(int x=0; x<i; x++) {
				if(arr[i] == arr[x]) {
					i--;
				}
			}
		}
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	
	public void practice12() {
		
		System.out.println("로또 번호 자동 생성기");
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*45+1);
			arr[i] = ran;	
			
			for(int x=0; x<i; x++) {
				if(arr[i] == arr[x]) {
					i--;
				}
			}
		}
		
		Arrays.sort(arr);
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	
	public void practice13() {
//		모르겠다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		

		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int x=0; x<i; x++) {
				if(arr[i] == str.charAt(x)) {
					break;
				}
				arr[i] = str.charAt(i);
			}
		}
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public void practice14() {
//		구현 실패
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
		int arrLength = sc.nextInt();
		
		String[] arr1 = new String[arrLength];
		
		for(int i=0; i<arr1.length; i++) {
			
			System.out.print((i+1) + "번째 문자열 : ");
			arr1[i] = sc.next();
			
		}
		
		String[] arr2 = null;
		
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String answer = sc.next();	
			
			if(answer.equals("n") || answer.equals("N")) {
				System.out.println(Arrays.asList(arr2));
				break;
			} else {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				
				arr2 = new String[arr1.length+num];
				
				System.arraycopy(arr1, 0, arr2, 0, arr1.length);
				
				for(int i=arr1.length; i<arr2.length; i++) {
					
					System.out.print((i+1) + "번째 문자열 : ");
					arr2[i] = sc.next();		
				}
			}
		}
		
	}
	
	
	
	
	
	public void practice15() {
		
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {
				
				arr[i][x] = x;	
			}
			
		}
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {
				System.out.printf("(%d, %d)",i,x);	
				if(x==arr.length-1) {
					System.out.println();
				}
			}
			
		}
		
	}
	
	
	public void practice16() {
		
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {
				
				arr[i][x] = count;
				
				count++;
			}
			
		}
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {			
				System.out.printf("%3d", arr[i][x]);
				if(x==arr.length-1) {
					System.out.println();
				}
			}
			
		}
		
	}
	
	
	public void practice17() {
		
	int[][] arr = new int[4][4];
		
		int count = 16;
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {
				
				arr[i][x] = count;
				
				count--;
			}
			
		}
		
		for(int i=0; i<arr.length; i++ ) {
			
			for(int x=0; x<arr.length; x++) {			
				System.out.printf("%3d", arr[i][x]);
				if(x==arr.length-1) {
					System.out.println();
				}
			}
			
		}
		
	}
	
	
	
	
	
	public void practice18() {
		
		int[][] arr = new int[4][4];
		
		
		for(int row=0; row<arr.length-1; row++) {
			
			for(int col=0; col<arr[row].length-1; col++) {
				
				int ran = (int)(Math.random() * 10 +1); 
				arr[row][col] = ran;
				
				arr[row][arr[row].length-1] += ran; 
				
				arr[arr.length-1][col] += ran; 
				
				arr[arr.length-1][arr[row].length-1] += ran; 
				
			}
			
		}
		
		
		for(int row=0; row<arr.length; row++) {			
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	public void practice19( ) {
		
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		
		while(true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			for(int i=1; i<=10; i++) {
				
				if(row>10 || row<1 || col>10 || col<1) {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					continue;
				} 
				
			}
			char[][] arr = new char[row][col]; 
			
			for(int i=0; i<arr[row].length; i++) {
				
				for(int x=0; x<arr[col].length; x++) {
					
					arr[i][x] = (char)(65+i);
					
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
		
}
	


