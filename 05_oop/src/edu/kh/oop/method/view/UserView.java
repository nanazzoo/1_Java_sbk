package edu.kh.oop.method.view;

import java.util.Scanner;

import edu.kh.oop.method.model.service.UserService;
import edu.kh.oop.method.model.vo.User;

// 입출력용 클래스
public class UserView {
	Scanner sc = new Scanner(System.in);
	
	private UserService service = new UserService();
	
//	User 참조 변수 선언(아직 참조하는 객체가 없다)
	private User user = null;

	
//	메뉴 출력 기능(메서드)
	public void displayMenu() {
		int input = 0; //메뉴 입력용 변수
		
		do {
			System.out.println("---------- 사용자 기능 메뉴 ----------");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 회원 정보 출력");
			System.out.println("5. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input=sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(input) {
			case 1 :  break;
			case 2 :  break;
			case 3 :  break;
			case 4 :  break;
			case 5 :  break;
			case 0 : System.out.println("프로그램을 종료합니다 ..."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
			} while(input != 0);
		
		
	
	}
	
	
	
//	회원 가입 정보를 입력 받는 메서드
	public void signUp() {
		System.out.println("[회원 가입]");
		
		System.out.print("아이디: ");
		String id = sc.next();
		
		System.out.print("비밀번호: ");
		String pw = sc.next();
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		
//		회원 가입 서비스 호출
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
