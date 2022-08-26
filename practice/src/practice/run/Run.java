package practice.run;

import practice.model.service.IOService;
import practice.model.service.StudentService;
import practice.view.StudentView;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new StudentView().displayMenu();
		
		IOService service = new IOService();
		
		service.fileCopy();
		

	}

}
