package edu.kh.oop.field.ex1;

public class FieldTest2 {
	
	public void ex() {
		
		FieldTest f = new FieldTest();
		
		System.out.println("같은 패키지, 다른 클래스");
		
//		public
		System.out.println(f.v1);
		
//		protected
		System.out.println(f.v2);
		
//		(default)
		System.out.println(f.v3);
		
//		private
//		System.out.println(f.v4); Error
//		-> private = 같은 클래스내부에서만 직접 접근 가능
		

	}

}
