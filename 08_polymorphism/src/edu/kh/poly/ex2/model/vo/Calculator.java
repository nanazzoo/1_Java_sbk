package edu.kh.poly.ex2.model.vo;

// 계산기 인터페이스
// --> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점의 용도 
public interface Calculator {
	
	public static final double PI = 3.14;
	static final int MAX_NUM = 1000000; //100만
	final int MIN_NUM = -1000000; //-100만
	int P_NUM = 333;
//	--> 예약어가 어떻게 작성되든 public static final
	
	
	public abstract int plus(int num1, int num2);
	
	abstract int minus(int num1, int num2);
	
	abstract int multiple(int num1, int num2);
	
	abstract double divide(int num1, int num2);  //나누기는 double형으로
	
	abstract double areaOfCircle(double r);
//								  반지름
	
	double pow(double a, int b); // a의 b제곱
	
	
	

}
