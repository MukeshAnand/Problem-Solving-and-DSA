import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestThread {
	
	static MyThread threads[];

	public static void main(String[] args) {
		
	
		getThreadPool(10);
		execute();

	}
	
	public static MyThread[] getThreadPool(int size) {
		
      Semaphore semaphore = new Semaphore(size);
		
		threads= new MyThread[size];
		
		for(int i=0;i<size;i++) {
			threads[i]=new MyThread(semaphore);
		}

		return threads;
		
	}
	
	public static void execute() {
		
		for(MyThread thread: threads) {
			
			thread.start();
			
		}
	}
	
	public static void shutDown() {
		
		System.exit(1);
	}

}

class MyThread extends Thread{
	
	Semaphore semaphore;
	
	MyThread(Semaphore semaphore){
		this.semaphore = semaphore;
	}
	
	public void run() {
		
		
		try {
			semaphore.acquire(); // thread 11 to wait until release happen 
			
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			
		}catch(Exception ex ) {
			System.out.println(ex);
		}finally {
			semaphore.release();
		}
	}
	
	
	
	// input 1 1 2 2 3 4 4 5 5 
}
