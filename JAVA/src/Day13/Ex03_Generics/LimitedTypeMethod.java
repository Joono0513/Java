package Day13.Ex03_Generics;

public class LimitedTypeMethod {
	// 제네릭 메소드 타입 제한
	// Number : 자식 클래스(Integer, Double 등 숫자 관련 클래스)
	public <T extends Number> void method(T t) {
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.<Integer>method(1234);	// <Integer>, <Double> 생략 가능
		ltm.<Double>method(12.34);
		
		// (Err) ltm.method("123.456");
		// 문자열은 Number 클래스의 자식 클래스가 아니므로 에러 발생
	}
}
