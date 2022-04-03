package bank;

public class AxisBank extends BankInfo{
	
	public void deposit () {
		System.out.println ("Axis bank deposit");
	}

	public static void main(String[] args) {
	
		AxisBank myaxis = new AxisBank ();
		myaxis.deposit();
		myaxis.savings();
		myaxis.fixed();

	}

}
