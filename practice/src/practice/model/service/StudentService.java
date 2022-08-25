package practice.model.service;

import java.util.ArrayList;
import java.util.List;

import practice.model.vo.Student;

public class StudentService {
	
	private List<Student> stdList = new ArrayList<Student>();

	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		Student std = new Student(name, age, address, gender, score);
		
		return stdList.add(std);
		
	}

	public List<Student> getStdList() {
		
		return stdList;
	}

	public boolean updateStudent(int idx, String address, int score) {
		
		if(idx<0 || idx<=stdList.size()) {
			return false;
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			return true;
		}
		
		
	}

}
