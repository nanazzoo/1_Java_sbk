package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {
	
//	회원 가입 서비스 메서드
	public void signUp(String userId, String userPw, String userName, 
			int userAge, char userGender) {
		
//		기본 생성자를 이용해서 User 객체를 생성
		User u = new User();
		
//		setter를 이용해서 매개변수로 전달 받은 값을 세팅
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		
	}

}
