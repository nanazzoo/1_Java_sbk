package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		SBK 신보경 = new SBK(); 
//		heap 영역에 SBK 클래스에 정의된 내용을 이용하여
//		SBK 객체 생성(할당)
		
		System.out.println("이름: " + 신보경.name);
		System.out.println("나이: " + 신보경.age);
		System.out.println("생년월일: " + 신보경.birthday);
		
		신보경.study();
		신보경.eat();
		신보경.plus(1, 2);
		

	}

}
