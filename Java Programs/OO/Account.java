//Fields declaration
class Account
{
	int accNo;
	String name;
	double  balance;
	void setAccount(int acc,String cust,double bal)
	{  
	accNo = acc;
	name = cust;
	balance = bal;
	}

	void customerDisp()
	{ 
		System.out.println("Customer Name " + name);
		System.out.println("Customer Account number " + accNo);
		System.out.println("Account Balance " + balance);		
	}
	
	double checkBalance()
	{
		return balance;
	}
}