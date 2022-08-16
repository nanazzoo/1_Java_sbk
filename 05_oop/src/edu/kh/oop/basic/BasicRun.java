package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		SBK 신보경 = new SBK(); 
//		heap 영역에 SBK 클래스에 정의된 내용을 이용하여
//		SBK 객체 생성(할당)
		
		
//		객체가 가진 속성
		System.out.println("이름: " + 신보경.name);
		System.out.println("나이: " + 신보경.age);
		System.out.println("생년월일: " + 신보경.birthday);
		
		
//		System.out.println("비밀번호: " + 신보경.password);
//		The field SBK.password is not visible
		
//		비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		신보경.showPassword();
		
		
//		객체가 가진 기능
		신보경.study();
		신보경.eat();
		신보경.plus(1, 2);
		

	}

}
