package Day06.Ex02_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Account account = new Account(0, "한성호", "282401-04-109955", "국민은행");
		
		// deposit 변수는 private로 지정했기 떄문에, 접근 불가
		// (err)account.deposit = 10000;
		account.setDeposit(10000);
		
		int money = account.getDeposit();
		System.out.println(account);
		System.out.println("예금액 : " + money);
		
	}
}
