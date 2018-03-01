 
public class ThreadsExample {
 
	/**
	 * @author Crunchify.com
	 */
 
	public static void main(String args[]) {
		new ThreadTest("Corinne").start();
		new ThreadTest("Naveena").start();
		new ThreadTest("Lauren").start();
		new ThreadTest("Waya").start();
	}
}
 
class ThreadTest extends Thread {
	public ThreadTest(String str) {
		super(str);
	}
 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Loop " + i + ": " + getName());
			try {
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Test Finished for: " + getName());
	}
}