package Week1;
import java.io.*;
import java.util.*;
public class PaymentGateway {

	public static void main(String[] args) {
		PaymentGateway User=new PaymentGateway();
		User.InitiatePayment();
	}
	
	public void InitiatePayment() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 For Credit Card");
		System.out.println("Enter 2 For Wallet");
		System.out.println("Enter 3 For Net Banking");
		System.out.println("Enter 4 For UPI");
		switch (s.nextInt()) {
		case 1:
			CreditCard obj1=new CreditCard();
			System.out.println("Enter Your Order Id");
			obj1.setOrderId(s.next());
			System.out.println("Enter Your Cost");
			obj1.setAmount(s.nextInt());
			obj1.setGatewayName("Credit Card");
			obj1.InputDetails(obj1);
			obj1.Calculate(obj1);
			Details(obj1);
			break;
			
		case 2:
			Wallet obj2=new Wallet();
			System.out.println("Enter Your Order Id");
			obj2.setOrderId(s.next());
			System.out.println("Enter Your Cost");
			obj2.setAmount(s.nextInt());
			obj2.setGatewayName("Wallet");
			obj2.InputDetails(obj2);
			obj2.Calculate(obj2);
			Details(obj2);
			break;
			
		case 3:
			NetBanking obj3=new NetBanking();
			System.out.println("Enter Your Order Id");
			obj3.setOrderId(s.next());
			System.out.println("Enter Your Cost");
			obj3.setAmount(s.nextInt());
			obj3.setGatewayName("Net Banking");
			obj3.InputDetails(obj3);
			obj3.Calculate(obj3);
			Details(obj3);
			break;
			
		case 4:
			UPI obj4=new UPI();
			System.out.println("Enter Your Order Id");
			obj4.setOrderId(s.next());
			System.out.println("Enter Your Cost");
			obj4.setAmount(s.nextInt());
			obj4.setGatewayName("UPI");
			obj4.InputDetails(obj4);
			obj4.Calculate(obj4);
			Details(obj4);
			break;
		}
	}
	
	public void Details(Gateways obj) { //Abstraction
		System.out.println("Order ID "+obj.getOrderId());
		System.out.println("Gateway Name "+obj.getGatewayName());
		System.out.println("Amount To be deducted "+obj.getAmount());
		System.out.println("Bank name "+obj.getBankName());
		System.out.println("Balance Left "+obj.getBalance());
	}

}
