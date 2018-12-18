import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {

	public static void main(String[] args) {

		ExecutorService execPool = Executors.newFixedThreadPool(4);

		SuTeread suT = new SuTeread();
		for (int i = 1; i <= 4; i++) {

			execPool.execute(new Thread(suT));
		}
		execPool.shutdown();

		/*AtomicInteger autoIn = new AtomicInteger(10);
		System.out.println(autoIn.decrementAndGet());*/

	}

}
 
class SuTeread implements Runnable {

	AtomicInteger autoIn = new AtomicInteger(100);

	public void run() {
		 
		Integer temp  =0 ; 
		while (true) {
			temp = getNumber() ; 
			boolean issushu = isSuShu(temp);
			if (issushu) {
				System.out.println(temp);
			}
			if(temp <= 0 )
				return ;
		}

	}

	public   Integer getNumber() {
		 
		return autoIn.decrementAndGet();
		  
	}
	
	
	public    boolean isSuShu(Integer num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

