package Buoi_14.Lec7.queueBuffer;

public class Producer extends Thread {
	private Buffer sharedBuffer;

	public Producer(Buffer shared) {
		super("Producer");
		sharedBuffer = shared;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((long) (Math.random() *1000));
				sharedBuffer.set(i);
				System.out.println("Producer day hang vao kho " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " completed");
	}
}
