package Buoi_14.Lec7.queueBuffer;
import java.util.*;
public class Buffer {
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
