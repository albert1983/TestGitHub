
public class TestVolaite {

	public static void main(String args[]) {
		
		ThreadVoliate thread = new ThreadVoliate();
		
		Thread thread1 = new Thread(thread);
		thread1.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread(thread);
		thread.setFlag(false);
		
		thread2.start();
		
	}

}


class ThreadVoliate implements Runnable{

	private volatile boolean flag = true; 
	
	public void run() {
		
		while(flag) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("test voliate ");
		}
		
		System.out.println("test is down");
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}