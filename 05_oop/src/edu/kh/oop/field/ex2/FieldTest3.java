package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;

//           자식               부모
public class FieldTest3 extends FieldTest{
//	[접근제한자] [예약어] class 클래스명 [상속관계]

	public void ex() {
		
		FieldTest f = new FieldTest();
		
		System.out.println("다른 패키지");
		
//		public
		System.out.println(f.v1);
		
//		protected
//		System.out.println(f.v2); Error
//		 -> 다른 패키지, 상속 X
		
		System.out.println(v2);
//		상속 관계일 때 protected 직접 접근 가능
		
//		(default)
//		System.out.println(f.v3); Error
//		 -> 다른 패키지

		
	}
	
}
