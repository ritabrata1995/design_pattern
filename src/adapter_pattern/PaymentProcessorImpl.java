package adapter_pattern;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public int pay(int dollars) {
		
		System.out.println("Payment of $" + dollars + " completed");
		return dollars;
	}

}
