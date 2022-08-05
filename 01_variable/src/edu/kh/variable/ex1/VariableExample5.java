package edu.kh.variable.ex1;

public class VariableExample5 {
	
	public static void main(String[] args) {
		
		/*
		 * 출력 메서드
		 * 
		 *   System.out.print("내용");
		 *    -> () 안의 내용 출력 (줄바꿈 X)
		 *   
		 *   System.out.println("내용");
		 *    -> () 안의 내용 출력 (줄바꿈 O)
		 *   
		 *   System.out.printf("내용 + 패턴" , 패턴에 들어갈 값);
		 * 	  -> 줄바꿈 X
		 *   
		 */
		
		   System.out.print("aaaaa");
		   System.out.print("bbbbb"); 
		   System.out.println("ccccc");
		   System.out.println("ddddd");
		   
		   
		   
//		   printf
		   
		   String name = "신보경";
		   int age = 30;
		   char gender = '여';
		   double height = 173.0;
		   boolean tf = true;
		   
//		   신보경님은 30세 여성, 키는 173.0입니다. (true)
		   
		   System.out.println(name + "님은 " 
				   			+ age + "세 " 
				   			+ gender + "성, 키는 " 
				   			+ height + "cm 입니다. "
				   			+ "(" + tf + ")" );
		   
		   System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b)\n", 
				   			name, 
				   			age, 
				   			gender, 
				   			height, 
				   			tf);
//		   \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자
		   
		   System.out.println("줄 바뀌었나요?");
		   
		   
		   
		   
	}

}
