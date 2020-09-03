package Buoi_14.Lec7.bufferArray;

import java.util.Arrays;

public class BufferMang {
	 private int[] Buffer = new int[5];// Tong co 5 o
	 private int readFrom = 0;
	 private int writeFrom = 0;
	 private int soLuongOtrong = Buffer.length;// so o trong
	 public BufferMang(){
             Arrays.fill(Buffer, -1);
         }
        public synchronized void set(int i){
           while(soLuongOtrong<=0){// Hang doi day 
              try{
                      wait();
              }catch(Exception e){
                      System.out.println(e);
              }
           }
           //....
           //
           soLuongOtrong--;
           Buffer[writeFrom] = i;
           if(writeFrom<Buffer.length-1) writeFrom++;
           else writeFrom = 0; 
           notify();
        }
	 public synchronized int get(){
		 while(soLuongOtrong>= Buffer.length){// Het du lieu trong hang doi 
                    try{
                            wait();
                    }catch(Exception e){
                            System.out.println(e);
                    }
		 }
		 soLuongOtrong++;
		 if(readFrom<4) 
                     readFrom++;// %5
		 else 
			 readFrom = 0;
		 notify();
		 if(readFrom==0) return Buffer[4];
		 return Buffer[readFrom-1];
	 }
	 
}
