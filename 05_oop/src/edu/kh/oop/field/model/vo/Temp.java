package edu.kh.oop.field.model.vo;

public class Temp {

	private int num;
	private String name;
	
//	생성자 관련 규칙
	
//	1. 생성자가 하나도 작성되지 않으면 컴파일러가 기본 생성자를 추가해준다
	
//	2. 매개변수 생성자 작성시 컴파일러가 기본 생성자를 자동 추가 하지 않으므로
//	   기본 생성자를 같이 작성해야 한다
	
	//	기본 생성자(필수)
		public Temp() { }
		
		
	//	매개변수 생성자
		public Temp(int num, String name) {
			this.num = num;
			this.name = name;
		}
		
	
	
}
