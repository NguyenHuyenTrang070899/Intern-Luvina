package Buoi_14.Lec7.queueBuffer;

public class Consumer extends Thread {
	private Buffer sharedBuffer;

	public Consumer(Buffer shared) {
		super("Consumer");
		sharedBuffer = shared;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 99; i++) {
			try {
				Thread.sleep((long) (Math.random() * 3000));
				sharedBuffer.get();
				System.out.println("Consumer lay hang ra kho " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " completed");
	}

}
