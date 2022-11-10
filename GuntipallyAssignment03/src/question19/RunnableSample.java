package question19;

public class RunnableSample implements Runnable{
	public void run() {
		System.out.println("Thread started running..");
	}

	public static void main(String args[]) {
		RunnableSample mt = new RunnableSample();
		Thread t = new Thread(mt);
		t.start();
	}
}
