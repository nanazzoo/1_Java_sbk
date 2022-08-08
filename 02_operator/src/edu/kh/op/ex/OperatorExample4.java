package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		
		/*논리 연산자 : &&(AND), ||(OR) 
		 * 
		 * &&(AND) : 둘 다 true이면 true, 나머지는 false
		 * 	-> ~와, 그리고(~이고), ~이면서(~면서), ~부터 ~까지, ~사이
		 * 		 * 
		 * 
		 * ||(OR) : 둘 다 false이면 false, 나머지는 true
		 * 	-> ~또는, ~거나(~이거나), 
		 * 
		 *	 && || 중 && 우선
		 * 
		 * 논리 부정 연산자: !(NOT) 
		 *  -> 논리 값을 반대로 바꿔주는 연산자
		 * 
		 * */
		
		
		
		/* &&(AND) */
			int a = 101;
	//		a는 100 이상 이면서 짝수인가?
			
			boolean result1 = a >= 100;   //true
			boolean result2 = a % 2 == 0; //false
			
			System.out.println("a는 100 이상 이면서 짝수인가? "+(result1 && result2));
			
			
			
			int b = 5;
	//		b는 1부터 10 사이의 정수인가?
			
			boolean result3 = b >= 1;  //true
			boolean result4 = b <= 10; //true
			
			System.out.println("b는 1부터 10 사이의 정수인가? " + (result3 && result4));
			
		
		
		/* ||(OR) */
		System.out.println("---------------------------------------------------");
		
			int c = 10;
	//		c는 홀수이거나 10을 초과하는 수인가?
			
			System.out.print("c는 홀수이거나 10을 초과하는 수인가? ");
			System.out.println(c%2 == 1 || c > 10); //fasle
			
			
			int d = 20;
	//		d는 1부터 100 사이 숫자 또는 음수인가?
			
			boolean result5 = d >= 1 && d <= 100 || d < 0;
			
			System.out.println("d는 1부터 100 사이 숫자 또는 음수인가? " + result5);
			
		
		
		/* !(NOT) */
			
		System.out.println("---------------------------------------------------");
		
			System.out.println("!result5 : " + !result5); // !true -> false
		
			int e = 3;
			
			
//			e는 1 이상이고, 5 미만인가?
			boolean result6 = e >= 1 && e < 5;  //true

//			*반대 : e는 1 미만이거나 5 이상인가?
			boolean result7 = e < 1 || e >= 5;  //false
//			== !result6
			
		
//			result6의 반대가 result7과 같은가?
			System.out.println("result6의 반대가 result7과 같은가? " + (!result6 == result7));
			
		
		
	}
	
}
