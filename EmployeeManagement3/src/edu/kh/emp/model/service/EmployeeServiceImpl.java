package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.emp.model.vo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private int empIdCount = 1;
	
	private List<Employee> empList = new ArrayList<>();
	
	public EmployeeServiceImpl() {
		empList.add(new Employee(empIdCount++, "홍대표", "700509-1234567", "dp_hong@emp.com", "010-1111-1111", "대표", "대표", 10000000));
		empList.add(new Employee(empIdCount++, "김부장", "751103-2987654", "bj_kim@emp.com",  "010-3456-7890", "회계", "부장", 6000000));
		empList.add(new Employee(empIdCount++, "이과장", "800317-1122334", "kj_lee@emp.com",  "010-2684-9753", "총무", "과장", 5000000));
		empList.add(new Employee(empIdCount++, "최대리", "900931-2654321", "dr_choi@emp.com", "010-8888-6666", "회계", "대리", 4000000));
		empList.add(new Employee(empIdCount++, "박사원", "950224-1678423", "sw_park@emp.com", "010-2222-3333", "마케팅", "사원", 3000000));
	}

	@Override
	public boolean addEmployee(Employee emp) {
		//받아온 사원 정보에 empID값 추가
		emp.setEmpId(empIdCount++);
		return empList.add(emp);
//		empList에 사원 정보 추가 및 boolean값 반환
	}
	

	@Override
	public List<Employee> selectAll() {
		return empList;
	}

	@Override
	public Employee selectEmpNo(int empId) {
		Employee emp = null;
		for(Employee e: empList) {
			if(e.getEmpId() == empId) {
				emp = e;
				break;
			}
		}
			
		return emp;
		
	}

	@Override
	public void updateEmployee(Employee updateEmp) {
		Employee emp = selectEmpNo(updateEmp.getEmpId());
		
		emp.setEmail(updateEmp.getEmail());
		emp.setPhone(updateEmp.getPhone());
		emp.setDepartmentTitle(updateEmp.getDepartmentTitle());
		emp.setJobName(updateEmp.getJobName());
		emp.setSalary(updateEmp.getSalary());
		
	}

	@Override
	public Employee deleteEmployee(int empId) {
		Employee deleteEmp = null;
		
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmpId() == empId) {
				deleteEmp = empList.remove(i);
				break;
			}
		}
		return deleteEmp;
	}

	@Override
	public List<Employee> selectDepartment(String departmentTitle) {
		List<Employee> searchList = new ArrayList<>();
		
		for(Employee e : empList) {
			if(e.getDepartmentTitle().equals(departmentTitle)) {
				searchList.add(e);
			}
		}
		return searchList;
	}

	@Override
	public List<Employee> selectSalary(int salary) {
		List<Employee> searchList = new ArrayList<>();
		for(Employee e : empList) {
			if(e.getSalary() == salary) {
				searchList.add(e);
			}
		}
		
		return searchList;
	}

	@Override
	public Map<String, Integer> departmentalSalay() {
		Map<String, Integer> map = new HashMap<>();
		
		for(Employee e: empList) {
			String key = e.getDepartmentTitle();
			int value = map.get(key) == null ? 0: map.get(key);
			map.put(key, value + e.getSalary());
		}
		return map;
	}

}
