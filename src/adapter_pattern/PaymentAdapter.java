package adapter_pattern;

public class PaymentAdapter {
	
	public int pay(int rupees) {
		
		PaymentProcessor pp = new PaymentProcessorImpl();
		return pp.pay(rupees/73);
		
	}

}
