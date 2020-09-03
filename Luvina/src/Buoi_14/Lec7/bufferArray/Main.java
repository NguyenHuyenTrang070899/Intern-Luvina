package Buoi_14.Lec7.bufferArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferMang bufferMang = new BufferMang();
		Producer proce = new Producer(bufferMang);
		Consumer consu = new Consumer(bufferMang);
                
		proce.start();
		consu.start();
                
	}

}
