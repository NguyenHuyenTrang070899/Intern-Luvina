package Buoi_14.Lec7.bufferArray;

public class Producer extends Thread {
	 private BufferMang shareBuffer;
     public Producer(BufferMang share){
    	 super("producer");
    	 shareBuffer = share;
     }
     @Override
     public void run(){
        for(int i=1;i<=10;i++){
        try{
                Thread.sleep((int)(Math.random()*300));
                shareBuffer.set(i*10);
                System.out.println("Produre writes "+ i);
                 System.out.flush();
            } catch(Exception e){
                    System.out.println(e);
            }
        }
        System.out.println(getName()+" ket thuc");
    }
}
