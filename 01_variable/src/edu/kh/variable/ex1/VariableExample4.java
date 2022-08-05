package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/*
		 * 형변환(Casting) : 값의 자료형을 변환하는 것
		 * 
		 * 	형변환은 왜 필요한가?
		 * 	-> 컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해
		 * 
		 * 
		 * 	자동 형변환
		 * 	-> 자료형의 [값의 범위]가 서로 다른 두 자료형의 연산 시 
		 * 		[컴파일러]가 자동으로 
		 * 		[값의 범위]가 작은 자료형을 큰 자료형으로 변환
		 * 
		 * 		byte -> short -> int -> long -> float -> double
		 * 
		 * */
		
		
//			자동 형변환 확인 1)
				
				int num1 = 10;
				long num2 = 100L;
				
				System.out.println( "num1 + num2 = " + (num1 + num2));
//			
				
//			자동 형변환 확인 2)
				
				int num3 = 300;
				double num4 = 1.1;
			
//				int result = num3 + num4;
//				Type mismatch: cannot convert from double to int
				
				double result = num3 + num4;
//								 300 + 1.1
//								 int + double
//							   300.0 + 1.1
//							  double + double = double
				
				System.out.println("num3 + num4 = " + result);
				
			
//			자동 형변환 확인 3)
//				char -> int 자동 형변환
				
				int num5 = 'a'; // 대입도 연산이다.
//					int  = char
				System.out.println(num5);
				
				
				char ch = 97;	//형변환 예외 상황 (큰 -> 작은 쪽으로 자동 형변환)
				System.out.println("ch : " + ch);
				
				
				char ch2 = '신';
				int result2 = ch2;
				System.out.println(ch2 + "'s Unucode Number : " + result2);
				
				
				
			System.out.println("----------------------------------------------");
			System.out.println(" ***강제 형변환***");
				
			/*
			 * 강제 형변환 
			 *  -> 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환
			 *  	강제 형변환 시 데이터 손실이 발생할 수 있음
			 */
				
				double temp = 3.14;
				int result3 = (int)temp; //값의 범위가 큰 double을 int로 강제 형변환
				
				System.out.println("result = " + result3); // 3 (소수점 버림 처리)
				
				
				int temp2 = 290;
				byte result4 = (byte)temp2; //int -> byte 강제 형변환
				
				System.out.println("int 290 -> byte " + result4); //34
				
				
			/*
			* 강제 형변환의 다른 사용 예시
			* 	->강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능
			*/
				
				int iNum1 = 1;
				int iNum2 = 2;
				
				System.out.println(iNum1 / iNum2);	//0
				
//				강제 형변환 / 자동 형변환을 동시에 이용
				System.out.println((double)iNum1 / iNum2);  //0.5
//										    1.0  /	2.0  =  0.5
//										   double + int = double
//												  ->double
				
				
				System.out.println((char)65); // 'A'  int -> char 강제 형변환
				System.out.println((int)'A'); // 65   char -> int 강제 형변환
				
				
		
		
		
		
		
	}

}
