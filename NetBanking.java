package Week1;

import java.util.Scanner;

public class NetBanking extends Gateways implements WorkingOfGateway {
	public void InputDetails(Gateways obj) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Bank Name");
		obj.setBankName(s.next());
		System.out.println("Enter your Account Number");
		obj.setAccountNumber(s.next());
		System.out.println("Enter your Password");
		obj.setPassword(s.next());
		System.out.println("Enter your Balance");
		obj.setBalance(s.nextInt());
	}
	
	public boolean Validate(Gateways obj) {
		return true;
	}
	public int Calculate(Gateways obj) {
		try {
		if(obj.getBalance()<obj.getAmount()) {
			throw new BalanceInsufficientException();
		}
		else {
		int cal=obj.getBalance()-obj.getAmount();
		obj.setBalance(cal);
		}
		return obj.getBalance();
		}
		catch(BalanceInsufficientException exp) {
			System.out.println(exp);
		}
		return 0;
	}

}
