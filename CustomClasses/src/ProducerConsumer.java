import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	
	Queue<Integer> queue;
	
	ReentrantLock lock = new ReentrantLock();
	Condition added = lock.newCondition();
	Condition removed = lock.newCondition();
	private static final int SIZE =10;
	
	public void producer() throws InterruptedException {
		lock.lock();
		
		try {
			
			while(queue.size()==SIZE) {
				removed.await();
			}
			
			queue.add(1);
			added.signal();
			
		}finally {
			lock.unlock();
		}
	}
	
	public int consumer() throws InterruptedException {
		lock.lock();
		
		try {
			 while(queue.size()==0) {
				 added.await();
			 }
			 
			 int data = queue.poll();
			 removed.signal();
			 return data;
			
		}finally {
			lock.unlock();
		}
	}
	
	
	
	
	

}
