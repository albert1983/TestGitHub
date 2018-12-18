import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestABC {

	public static void main(String[] args) { 
		
		Executor ss ; 
	}

}

class AttrDemo{
	
	private int num = 1 ; 
	
	private Lock  lock = new ReentrantLock();
	
	private Condition condition1 = lock.newCondition();
	
	public void  loopA() { }
	
}



