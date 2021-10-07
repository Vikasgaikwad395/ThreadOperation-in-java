class Table {
	public synchronized void printTable(int num) {
		for(int i = 1; i  <= 10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class MyThread1 extends Thread{
		Table t;
		
		MyThread1(Table t){
			this.t = t;
		}
		public void run() {
			t.printTable(15);
		}
		
}
class MyThread extends Thread{
	Table t;
	
	MyThread(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(21);
	}
}
	
	public class Syschronization {
			public static void main(String[] args) {
				
				Table t = new Table();
				MyThread1 t1 = new MyThread1(t);
				MyThread t2 = new MyThread(t);
				
				t1.start();
				t2.start();
			}
			
}
