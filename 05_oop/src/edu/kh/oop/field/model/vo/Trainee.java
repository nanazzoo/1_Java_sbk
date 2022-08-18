package edu.kh.oop.field.model.vo;

public class Trainee {
	
	public String name;
	public String phone;
	public String email;
	public int salary;   //급여(훈련 수당)
	
	public static char classRoom = 'A'; //강의장
	
	
//	명시적 초기화 == 필드 선언 시 바로 값 초기화
//	ex) public String email = "없음";
	
	/*
//	초기화 블록: 객체(instance) 객체의 필드를 초기화 하는 블록
//	 - instance block: static이 없는 필드 값 초기화(생성 시 마다)
//	 - static block  : static이 있는 필드 값 초기화(프로그램 실행 시 1회)
	*/
	
	// instance block
	{ 
		email = "없음";
		salary = 116000;
	}
	
	
	// static block
	static { 
		classRoom = 'A';
	}
	
	
	
	
	
	
}
