package edu.kh.emp.run;

import edu.kh.emp.view.EmployeeView;
import edu.kh.emp.view.EmployeeViewImpl;

public class Run {

	public static void main(String[] args) {
		
		EmployeeView view = new EmployeeViewImpl();
		
		view.displayMenu();
		

	}

}
