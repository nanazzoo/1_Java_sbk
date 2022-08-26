package practice.model.service;

import java.util.ArrayList;
import java.util.List;

import practice.model.vo.Student;

public class StudentService {
	
	private List<Student> stdList = new ArrayList<Student>();
	
	public StudentService() {
		stdList.add(new Student("홍길동", 18, "서울시 도봉구", 'M', 80));
		stdList.add(new Student("신보경", 30, "서울시 중구", 'F', 90));
		stdList.add(new Student("김영희", 17, "서울시 강남구", 'F', 60));
	}

	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		Student std = new Student(name, age, address, gender, score);
		
		return stdList.add(std);
		
	}

	
	
	public List<Student> getStdList() {
		
		return stdList;
	}
	
	

	public boolean updateStudent(int idx, String address, int score) {
		
		if(idx<0 || idx>=stdList.size()) {
			return false;
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			return true;
		}
		
		
	}



	public Student removeStudent(int idx) {
			
		if(idx<0 || idx>=stdList.size()) {
			return null;
		} else {
			return stdList.remove(idx);
		}
	}

	public List<Student> searchByName(String input) {
		
		List<Student> resultList = new ArrayList<>();
		
		for(Student s : stdList) {
			if(s.getName().equals(input)) {
				resultList.add(s);
			}
		}
		
		return resultList;
	}

public List<Student> searchByName2(String input) {
		
		List<Student> resultList = new ArrayList<>();
		
		for(Student s : stdList) {
			if(s.getName().contains(input)) {
				resultList.add(s);
			}
		}
		
		return resultList;
	}

	
	
}
