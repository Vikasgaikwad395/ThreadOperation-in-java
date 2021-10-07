class Customer extends Thread{
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to Withdrawn........");
		
		if(this.amount < amount) {
			System.out.println("Less Amount: Waiting for Deposit....");
			try{
				wait();	
			}catch(InterruptedException e) {}
		}
	
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit.....");
		this.amount+=amount;
		System.out.println("Deposit completed..........");
		notify();
	
		this.amount = amount;
		System.out.println("Withdraw completed........");
	}
	
	

}
class Test{
	public static void main(String[] args)throws InterruptedException {
		
		Customer c = new Customer();
		c.start();
		c.withdraw(15000);
		
		
		Customer c1 = new Customer();
		c1.deposit(15000);
		c1.start();
		
	}
}