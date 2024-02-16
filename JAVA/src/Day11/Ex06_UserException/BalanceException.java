package Day11.Ex06_UserException;

/*
 * 사용자 정의 예외 클래스
 * - public cass ??Exception extends Exception {}
 */

public class BalanceException extends Exception{

	public BalanceException() {
		super();
		
	}

	public BalanceException(String message) {
		super(message);
		
	}
	
}
