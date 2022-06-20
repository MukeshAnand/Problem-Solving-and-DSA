
public class OddEvenNumber {
	public static void main(String []args) {
		
		Printer print=new Printer();
		
		TaskOddEven t1= new TaskOddEven(print, false,10,"Odd Thread");
		
		TaskOddEven t2= new TaskOddEven(print, true,10,"Even Thread");
		
		t1.start();
		t2.start();
		
		
		
	}

}

class TaskOddEven extends Thread{
	
	Printer printer;
	boolean isEven;
	int max;
	
	
	
	
	public TaskOddEven(Printer printer, boolean isEven, int max, String name) {
		super(name);
		this.printer = printer;
		this.isEven = isEven;
		this.max = max;
	}


	public void run() {
		
		int num = isEven ? 2:1;
		
		while(num<=max) {
			if(isEven) {
				printer.printEven(num);
			}else {
				printer.printOdd(num);
			}
		   num +=2;
		}
	}
}

class Printer{
	private volatile boolean isOdd = false;
	
	public synchronized void printEven(int num) {
		
		while(!isOdd) {
			try {
			wait();
			}catch(Exception ex) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+":"+num);
		isOdd=false;
		notify();
		
	}
	
	public synchronized void printOdd(int num) {
		
		while(isOdd) {
			try {
			wait();
			}catch(Exception ex) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+":"+num);
		isOdd=true;
		notify();
		
	}
}
