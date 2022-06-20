import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
	
	 private Thread[] threads;

	 private static BlockingQueue<Runnable> queue;
	
	 CustomThreadPool(int size){
		 queue = new LinkedBlockingQueue<>(2);
		 threads = new Thread[size];
		 
		 for(int i=0;i<threads.length;i++) {
			 threads[i]=new Worker("Thread Pool "+i);
			 threads[i].start();
		 }

	 }
	 
	 public static void addTask(Runnable runnable) {
		 try {
			queue.put(runnable);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
	 class Worker extends Thread{
			Worker(String name) {
				super(name);
			}
			
			public void run() {
				while(true) {
				try {
					
					queue.take().run();
					
				}catch(InterruptedException ex) {
					
				}
				}
			}
		}

	 public static void main(String[] args) {
		 
		 CustomThreadPool pool = new CustomThreadPool(10);
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
		 
		 addTask(()->System.out.println(Thread.currentThread().getName()));
	 }
}

