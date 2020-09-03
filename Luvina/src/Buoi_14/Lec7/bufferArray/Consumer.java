package Buoi_14.Lec7.bufferArray;

public class Consumer extends Thread {
	private BufferMang shareBuffer;
	public Consumer(BufferMang share){
		super("Consummer");
		shareBuffer = share;
	}
	public void run(){
            for(int i = 1;i<=10;i++){
                    try{
                            Thread.sleep((int)(Math.random()*100));
                            System.out.println("   Consumer reads "+ shareBuffer.get());
                             System.out.flush();
                    }catch(Exception e){
                            System.out.println(e);
                    }
            }
            System.out.println(getName()+ "ket thuc");
	}
}
