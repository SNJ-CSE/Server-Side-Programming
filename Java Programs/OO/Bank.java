// crate object of a class

class Bank {
	public static void main(String[] s)
{
	Account act1;
	act1 = new Account();
	
	Account act2 = new Account();

// Acceesing class members
	
	int act = 12345;
	String name = "Anilkumar";
	double bal = 5000.0;
	
	act1.setAccount(act,name,bal);
	act1.customerDisp();
	double cbal = act1.checkBalance();
	System.out.println("Account Balance " + cbal);

	act2.accNo = 56789;
	act2.name = "Suresh";
	act2.balance = 10000.0;


	act2.customerDisp();
	cbal = act2.checkBalance();
	System.out.println("Account Balance " + cbal);


}

}