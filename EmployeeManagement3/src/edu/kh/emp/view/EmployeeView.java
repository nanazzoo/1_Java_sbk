package edu.kh.emp.view;

import java.util.List;

import edu.kh.emp.model.vo.Employee;

public interface EmployeeView {
	
	public abstract void displayMenu();
	
	public abstract void addEmployee();
	
	public abstract void selectAll();
	
	
	public abstract void selectEmpId();
	
	
	public abstract void updateEmployee();
	
	
	public abstract void deleteEmployee();
	
	
	public abstract void selectDepartment();
	
	
	public abstract void selectSalary();
	
	
	public abstract void departmentalSalary();
	
	
//	-------------------------------------------------
//	공용  메서드
	
	/*사원 정보 모두 출력
	 * 전달 받은 empList에 있는 내용을 향상된 for문을 이용해 모두 출력
	 * */
	
	public abstract void printAll(List<Employee> empList);
	
	
	
	public abstract void printOne(Employee emp);
	
	
	
	public abstract int inputEmpId();
	
	
	
	

}
