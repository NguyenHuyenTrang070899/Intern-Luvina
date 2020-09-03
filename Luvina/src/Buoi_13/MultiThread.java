package Buoi_13;

import java.util.*;

class Buffer {
    private Queue<Integer> queue;
    private int max;
    public Buffer(int max) {
        this.max = max; queue = new LinkedList<Integer>();
    }
    // dat hang vao kho
    public synchronized void set(int value) {
        while (queue.size() == max) { // kho full
            try {
                System.out.println("Kho Full. Waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // day vao hang doi
        queue.add(value);
        notify();
    }
    // Lay hang khoi kho
    public synchronized int get() {
        while (queue.isEmpty()) { // kho rong
            try {
                System.out.println("Kho empty. Waiting.....");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // lay hang
        int value = queue.remove();
        notify();
        return value;
    }
}
class Consumer extends Thread {
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
class Producer extends Thread {
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

public class MultiThread {
    public static void main(String[] args) {
        Buffer sharedBuffer = new Buffer(3);
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);
        producer.start();
        consumer.start();
    }
}
