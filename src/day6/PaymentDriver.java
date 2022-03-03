package day6;

public class PaymentDriver {

	public static void main(String[] args) {
		Payment payment;
		payment =new CreditCard("Raja", "Vizag",2500);
		payment.doPayment(355.6);
		payment = new MobileWallet("Rama", "Vijayawada",2500);
		payment.doPayment(100);

	}

}
