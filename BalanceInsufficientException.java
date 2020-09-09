package Week1;

public class BalanceInsufficientException extends Exception{
	void BalanceInsufficientException(Exception exp) {
		System.out.println(exp+" Sorry!! Insufficient Balance");
	}
}
