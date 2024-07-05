class MyThread implements Runnable  {

 Account account;

        public MyThread (Account s) { 

           account = s;

	}

        public void run() {
		Thread t= Thread.currentThread();
		
           account.deposit(1000); 
	System.out.println(t.getName()+" Balance " +account.balance);
	}
} 

class YourThread implements Runnable  {

 Account account;

        public YourThread (Account s) { 

          account = s;
         }

        public void run() { 

           account.withdraw(2000);
        System.out.println(" Your Balance after withdraw" +account.balance);
    }     
} 

class HerThread implements Runnable  {

 Account account;

        public HerThread (Account s) {
             account = s;
        }

        public void run() {
            account.enquire(); 
     }
} 