package Day04;

public class Ex07_String {

	public static void main(String[] args) {
		// String은 참조자료형
		// - 문자열 한 글자, 한 글자를 비교 시, equals()를 사용
		// 문자열 리터럴로 지정
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		// 문자열 객체 생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c : " + (a == c));			// True
		System.out.println("a == d : " + (a == d));			// False
		System.out.println("문자열 비교 : " + a.equals(d));		// True
		
		System.out.println("e == f : " + (e == f));			// False
		System.out.println("문자열 비교 : " + e.equals(f));		// True
	}

}
