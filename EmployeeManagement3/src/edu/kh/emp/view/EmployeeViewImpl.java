package edu.kh.emp.view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.model.service.EmployeeServiceImpl;
import edu.kh.emp.model.vo.Employee;

public class EmployeeViewImpl implements EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	
	private EmployeeService service = new EmployeeServiceImpl();
	

	@Override
	public void displayMenu() {
		 int input = 0;
		 
		 do {
			 try {
				System.out.println("---------------------------------------------------------");
				System.out.println("----- 사원 관리 프로그램 -----");
				System.out.println("1. 새로운 사원 정보 추가");
				System.out.println("2. 전체 사원 정보 조회");
				System.out.println("3. 사번이 일치하는 사원 정보 조회");
				System.out.println("4. 사번이 일치하는 사원 정보 수정");
				System.out.println("5. 사번이 일치하는 사원 정보 삭제");
				System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
				System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
				System.out.println("8. 부서별 급여 합 전체 조회");
				System.out.println("0. 프로그램 종료");
					
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
					
				System.out.println(); 
				
				switch (input) {
				case 1: addEmployee(); break;
				case 2: selectAll(); break;
				case 3: selectEmpId(); break;
				case 4:  break;
				case 5:  break;
				case 6:  break;
				case 7:  break;
				case 8:  break;
				case 0: System.out.println("<프로그램 종료>"); break;
				default: System.out.println("메뉴에 표시된 번호만 입력해주세요");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 숫자를 입력해주세요");
				input = -1;
				sc.nextLine();
			}finally {
				System.out.println();
			}
			 
			 
		 } while (input != 0);
		
		
	}

	@Override
	public void addEmployee() {
		System.out.println("<새로운 사원 정보 추가>");
		
		System.out.print("사원 이름: ");
		String empName = sc.next();
		
		System.out.print("주민등록번호: ");
		String empNo = sc.next();
		
		System.out.print("이메일: ");
		String email = sc.next();
		
		System.out.print("전화번호: ");
		String phone = sc.next();
		
		System.out.print("부서명: ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명: ");
		String jobName = sc.next();
		
		System.out.print("급여: ");
		int salary = sc.nextInt();
		
		Employee emp = new Employee(empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		if(service.addEmployee(emp)) {
			System.out.println("사원 정보 등록 완료");
		} else {
			System.out.println("사원 정보 등록 실패");
		}
	}

	@Override
	public void selectAll() {
		System.out.println("<전체 사원 정보 조회>");
		printAll(service.selectAll());
	}

	@Override
	public void selectEmpId() {
		System.out.println("<사번이 일치하는 사원 정보조회>");
		int empId = inputEmpId();
		
		printOne(service.selectEmpNo(empId));
	}

	@Override
	public void updateEmployee() {
		System.out.println("<사번이 일치하는 사원 정보 수정>");
		
		int empId = inputEmpId();
		
		if(service.selectEmpNo(empId) == null) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다");
		} else {
			System.out.print("이메일: ");
			String email = sc.next();
			
			System.out.print("전화번호: ");
			String phone = sc.next();
			
			System.out.print("부서명: ");
			String departmentTitle = sc.next();
			
			System.out.print("직급명: ");
			String jobName = sc.next();
			
			System.out.print("급여: ");
			int salary = sc.nextInt();
			
			Employee updateEmp = new Employee();
			updateEmp.setEmpId(empId);
			updateEmp.setEmail(email);
			updateEmp.setPhone(phone);
			updateEmp.setDepartmentTitle(departmentTitle);
			updateEmp.setJobName(jobName);
			updateEmp.setSalary(salary);
			
			service.updateEmployee(updateEmp);
		}
	}

	@Override
	public void deleteEmployee() {
		System.out.println("<사번이 일치하는 사원 정보 삭제>");
		
		int empId = inputEmpId();
		
		if(service.deleteEmployee(empId) == null) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다");
		} else {
			System.out.print("정말로 삭제하시겠습니까? (Y/N): ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch=='Y') {
				Employee deleteEmp = service.deleteEmployee(empId);
				System.out.println(deleteEmp.getEmpName() + "의 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제 취소");
			}
		}
	}

	@Override
	public void selectDepartment() {
		System.out.println("<입력 받은 부서와 일치하는 모든 사원 정보 조회>");
		System.out.print("부서명 입력");
		String dspartmentTitle = sc.next();
		
		printAll(service.selectDepartment(dspartmentTitle));
	}

	@Override
	public void selectSalary() {
		System.out.println("<입력 받은 급여 이상을 받는 모든 사원 정보 조회>");
		System.out.print("급여 입력: ");
		int salary = sc.nextInt();
		
		printAll(service.selectSalary(salary));
	}

	@Override
	public void departmentalSalary() {
		System.out.println("<부서별 급여 합 전체 조회>");
		Map<String, Integer> map = service.departmentalSalay();
		
		System.out.println( "   부서   |   급여 합계   ");
		System.out.println("---------------------------");
		for(String key: map.keySet()) {
			System.out.printf("%4s | %d\n", key, map.get(key));
		}
		
	}

	@Override
	public void printAll(List<Employee> empList) {
		if(empList.isEmpty()) {
			System.out.println("조회된 사원 정보가 없습니다.");
			
		} else {
			System.out.println("사번 |   이름  | 주민 등록 번호 |        이메일        |   전화 번호   | 부서 | 직책 | 급여" );
			System.out.println("------------------------------------------------------------------------------------------------");
			for(Employee emp : empList) { 
				System.out.printf(" %2d  | %4s | %s | %20s | %s | %s | %s | %d\n",
						emp.getEmpId(), emp.getEmpName(), emp.getEmpNo(), emp.getEmail(), 
						emp.getPhone(), emp.getDepartmentTitle(), emp.getJobName(), emp.getSalary());
			}
		}
		
	}

	@Override
	public void printOne(Employee emp) {
		if(emp == null) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다.");
			
		} else {
			System.out.println("사번 |   이름  | 주민 등록 번호 |        이메일        |   전화 번호   | 부서 | 직책 | 급여" );
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.printf(" %2d  | %4s | %s | %20s | %s | %s | %s | %d\n",
					emp.getEmpId(), emp.getEmpName(), emp.getEmpNo(), emp.getEmail(), 
					emp.getPhone(), emp.getDepartmentTitle(), emp.getJobName(), emp.getSalary());
		}
		
	}

	@Override
	public int inputEmpId() {
		System.out.print("사번 입력 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		return empNo;
	}

}
