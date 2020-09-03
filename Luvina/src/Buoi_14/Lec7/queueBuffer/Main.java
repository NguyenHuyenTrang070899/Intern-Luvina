package Buoi_14.Lec7.queueBuffer;

public class Main {
	public static void main(String[] args) {
		Buffer sharedBuffer = new Buffer(3);
		Producer producer = new Producer(sharedBuffer);

		Consumer consumer = new Consumer(sharedBuffer);
		producer.start();
		consumer.start();

	}
}
