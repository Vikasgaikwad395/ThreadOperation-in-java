
class RedSignalThread extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Red Signal Thread............");
			try {
			Thread.sleep(2000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		}	
		
	}
}

class YellowSignalThread extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Yellow Signal Thread............");
			try {
			Thread.sleep(3000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		}	
		
	}
}
class GreenSignalThread extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Green Signal Thread............");
			try {
			Thread.sleep(2000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		}	
		
	}
}
public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		
		RedSignalThread t1 = new RedSignalThread();
		t1.start();	
		t1.join();
		
		YellowSignalThread t2 = new YellowSignalThread();
		t2.start();
		t2.join();
		
		GreenSignalThread g = new GreenSignalThread();
		g.start();
	}

}
