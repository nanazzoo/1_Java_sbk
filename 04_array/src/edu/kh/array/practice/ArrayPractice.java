package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	
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
//		신충영님꺼 참조
		/*
		 * 문자열.length : 문자열의 길이
		 * 
		 * 문자열.charAt(인덱스번호) : 문자열에서 해당 인덱스 번째 문자 하나를 얻어옴
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
//		문자열 입력
		System.out.print("문자열 : ");
		String str = sc.next();
		
//		배열 생성
		char[] arr = new char[str.length()];

//		문자열의 내용을 문자 배열로 옮기기
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		
//		변수 선언부
		int count = 0;
		
		
//		중복 제거 후 배열에 대입
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;	
			for(int x=0; x<i; x++) {
				if(arr[i] == arr[x]) {
					flag = false;
					break;
				} 			
			}
			if(flag) {
				count++;
				System.out.print(arr[i]);
				if(i != arr.length-1) {
					System.out.print(", ");
				}
			}
		}
			
//		출력 구문
		System.out.println();
		System.out.println("문자 개수: " + count);
	}
	
	
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		

		String[] arr1 = null;
		String[] arr2 = null;
		String[] arr3 = null;
		
		int copyLength;
		
		System.out.print("배열의 크기를 입력하세요: ");
		int arrLength = sc.nextInt();
		sc.nextLine();
		
		arr1 = new String[arrLength];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+1 + "번째 문자열: ");
			arr1[i] = sc.nextLine();
		}
		
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
		char answer = sc.next().charAt(0);
		
		
		if(answer == 'N' || answer == 'n') {
			System.out.print("[ ");
			for(int i=0; i<arr1.length; i++) {
				if(i==arr1.length-1) {
					System.out.print(arr1[i] +" ");	
				} else {
					System.out.print(arr1[i] +", ");
				}
			}
			System.out.print("]");
		} else {
			System.out.print("더 입력하고 싶은 개수: ");
			copyLength = sc.nextInt();
			sc.nextLine();
				
			arr2 = new String[arr1.length+copyLength];
				
			for(int i=0; i<arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			
			for(int i=arr1.length; i<arr2.length; i++) {
				System.out.print((i+1) + "번째 문자열: ");
				arr2[i] = sc.nextLine();
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
			char answer2 = sc.next().charAt(0);
			
			
			if(answer2 == 'N' || answer2 == 'n') {
				System.out.print("[ ");
				for(int i=0; i<arr2.length; i++) {
					if(i==arr2.length-1) {
						System.out.print(arr2[i] +" ");	
					} else {
						System.out.print(arr2[i] +", ");
					}
				}
				System.out.print("]");
			} else {
				System.out.print("더 입력하고 싶은 개수: ");
				copyLength = sc.nextInt();
				sc.nextLine();
				
				arr3 = new String[arr2.length+copyLength];
				
				for(int i=0; i<arr2.length; i++) {
					arr3[i] = arr2[i];
				}
				
				for(int i=arr2.length; i<arr3.length; i++) {
					System.out.print((i+1) + "번째 문자열: ");
					arr3[i] = sc.nextLine();
				}
				
				System.out.print("[ ");
				for(int i=0; i<arr3.length; i++) {
					if(i==arr3.length-1) {
						System.out.print(arr3[i] +" ");	
					} else {
						System.out.print(arr3[i] +", ");
					}
				}
				System.out.print("]");
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
		
		while(true) {
			System.out.print("행 크기: ");
			int rowSize = sc.nextInt();
			
			System.out.print("열 크기: ");
			int colSize = sc.nextInt();
			
			if(rowSize>10 || rowSize<1 || colSize>10 || colSize<1) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
		
			
			char[][] arr = new char[rowSize][colSize];
			
			char a = 65;
			
			for(int i=0; i<arr.length; i++) {
				
				for(int x=0; x<arr[i].length; x++) {
					
					int ran = (int)(Math.random()* 25 +1);
					
					arr[i][x] = (char) (a+ran);
					
					
					
					
				}
				
			}
		
			for(int i=0; i<arr.length; i++) {
				
				for(int x=0; x<arr[i].length; x++) {
					System.out.print(arr[i][x] + " ");
					if(x==arr[i].length-1) {
						System.out.println();
					}
				}
			}
			break;
		}
	
	}	
	
	
	
	public void practice20() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기: ");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][];
		
		char count = 97; 
		
		
		for(int i=0; i<arr.length; i++) {
				System.out.print(i+"열의 크기: ");
				int colSize = sc.nextInt();
				
				arr[i] = new char[colSize];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[i].length; x++) {	
				arr[i][x] = count;
				count++;
				System.out.print(arr[i][x]+ " ");
				if(x==arr[i].length-1) {
					System.out.println();
				}
			}			
		}	
		
	}
	
	
	
	public void practice21() {
			
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0; 
		System.out.println("== 1분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[i].length; x++) {
				arr1[i][x] = students[count];
				count++;
				System.out.print(arr1[i][x] +"  ");
				
				if(x==arr1[i].length-1) {
					System.out.println();
				}
			}
		}
		System.out.println("== 2분단 ==");
		
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[i].length; x++) {
				arr2[i][x] = students[count];
				count++;
				System.out.print(arr2[i][x] +"  ");
				
				if(x==arr2[i].length-1) {
					System.out.println();
				}
			}
		}
	
	}
	
		
	public void practice22() {
		
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		
		int count = 0; 
		boolean flag = true;
		String col = "";
		
		
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[i].length; x++) {
				arr1[i][x] = students[count];
				count++;
				System.out.print(arr1[i][x] +"  ");
				
				if(x==arr1[i].length-1) {
					System.out.println();
				}
			}
		}
		System.out.println("== 2분단 ==");
		
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[i].length; x++) {
				arr2[i][x] = students[count];
				count++;
				System.out.print(arr2[i][x] +"  ");
				
				if(x==arr2[i].length-1) {
					System.out.println();
				}
			}
		}
		
		
		System.out.println("=========================");
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.next();
		
		
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[i].length; x++) {
				if(arr1[i][x].equals(name)) {
					if(x==0) {
						col = "왼쪽";
					}
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.",
							name, i+1, col);
					flag = false;
					break;
				}
				if(arr2[i][x].equals(name)) {
					if(x==1) {
						col = "오른쪽";
					}
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.",
							name, i+1, col);
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
		
	
	public void practice23() {
//		String변수 = Integer.toString(int변수);
		
		String[][] arr = new String[6][6];
		
		int count = 0;
		int count2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[i].length; x++) {
				if(i==0 && x>0) {
					arr[i][x] = Integer.toString(count);
					count++;	
				} else if(i>0 && x==0) {
					arr[i][x] = Integer.toString(count2);
					count2++;
				} else {
					arr[i][x] = " ";
				}
				
				
				}
				
			}	
			
		System.out.print("행 인덱스 입력: ");
		int rowIndex = sc.nextInt();
		
		System.out.print("열 인덱스 입력: ");
		int colIndex = sc.nextInt();
		
		arr[rowIndex+1][colIndex+1] = "X";
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[i].length; x++) {
				
				System.out.print(arr[i][x] + " ");
				if(x == arr[i].length-1) {
					System.out.println();
				}
					
			}
		}
		
	}	
	
	
	public void practice24(){
		
		String[][] arr = new String[6][6];
		
		int count = 0;
		int count2 = 0;
		
			for(int i=0; i<arr.length; i++) {
				for(int x=0; x<arr[i].length; x++) {
					if(i==0 && x>0) {
						arr[i][x] = Integer.toString(count);
						count++;	
					} else if(i>0 && x==0) {
						arr[i][x] = Integer.toString(count2);
						count2++;
					} else {
						arr[i][x] = " ";
					}
				}
			}	
		int a = 0;
		
		while(a != 99) {
			System.out.print("행 인덱스 입력: ");
			int rowIndex = sc.nextInt();
			
			
			System.out.print("열 인덱스 입력: ");
			int colIndex = sc.nextInt();
			
			arr[rowIndex+1][colIndex+1] = "X";
			
			for(int i=0; i<arr.length; i++) {
				for(int x=0; x<arr[i].length; x++) {
					
					System.out.print(arr[i][x] + " ");
					if(x == arr[i].length-1) {
						System.out.println();
					}
				}
			}
			
			System.out.print("행 인덱스 입력 >> ");
			a = sc.nextInt();
			
			if(a ==99) {
				break;
			}
		
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
				

		

	
	
	
	
	
	
	
	
	
	
	
	

	


