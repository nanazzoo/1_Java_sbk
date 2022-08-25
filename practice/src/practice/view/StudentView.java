package practice.view;

import java.security.Provider.Service;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import practice.model.service.StudentService;
import practice.model.vo.Student;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentService service = new StudentService();
	
	public void displayMenu() {
		
		int input = 0;
		
			
		do {
			System.out.println();
			System.out.println("\n========== 학생 관리 프로그램 ==========\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			
			System.out.println("0. 프로그램 종료");
			try {
				System.out.print("메뉴 입력 >> ");
				input = sc.nextInt();
				sc.nextLine();
				
				System.err.println();
				
			
			switch(input) {
			case 1 : addStudent(); break;
			case 2 : selectAll(); break;
			case 3 : updateStudent(); break;
			case 4 : removeStudent(); break;
			case 5 :  break;
			case 6 :  break;
			case 0 : System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
				
			} catch (InputMismatchException e) {
				System.out.println("제대로 입력해주세요");
				input = -1;
				sc.nextLine();
			}
			
		} while(input != 0);
		
		
	}







	public void addStudent() {
		
		System.out.println("[학생 정보 입력]");
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소: ");
		String address = sc.nextLine();
		
		char gender;
		while(true) {
			System.out.print("성별: ");
			gender = sc.next().toUpperCase().charAt(0);
			
			if(gender == 'M' || gender == 'F') {
				break;
			} else {
				System.out.println("M/F만 입력 가능합니다.");
			}
		} 
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if(service.addStudent(name, age, address, gender, score)) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
	}
	
	
	
	public void selectAll() {
		
		List<Student> stdList = service.getStdList();
		
//		for(int i=0; i<stdList.size(); i++) {
//			System.out.println(stdList.get(i));
//		}
//		
		for(Student s:stdList) {
			System.out.println(s);
		}
		
	}
	
	
	public void updateStudent() {
		System.out.println("[학생 정보 수정]");
		
		System.out.print("인덱스: ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 주소: ");
		String address = sc.nextLine();
		
		System.out.print("수정할 점수: ");
		int score = sc.nextInt();
		
		if(service.updateStudent(idx, address, score)) {
			System.out.println("수정 완료");
		} else {
			System.out.println("실패(인덱스 불일치)");
		}
		
		
	}

	
	private void removeStudent() {
		
		System.out.println("[학생 정보 제거]");
		
		System.out.print("인덱스: ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		Student s = service.removeStudent(idx);
		
		if(s == null) {
			System.out.println("인덱스 불일치");
		} else {
			System.out.println("제거 완료");
		}
		
	}
	
	
	
}
