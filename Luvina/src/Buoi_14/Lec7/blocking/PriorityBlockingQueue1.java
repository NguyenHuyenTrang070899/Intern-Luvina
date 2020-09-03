/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.Lec7.blocking;
 
import java.util.concurrent.*;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue1 {

    public static void main(String[] args) {
        String[] cityNames = {"Delhi", "Mumbai", "Chennai", "Bangalore", 
                "Hyderabad", "Lucknow"};
        // initializing PriortiyBlockingQueue
        BlockingQueue<String> priortyBQ = new PriorityBlockingQueue<String>();
        
        // Producer thread
        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < cityNames.length; i++){
                    try {
                        priortyBQ.put(cityNames[i]);
                         System.out.println(" Consumer got - " + priortyBQ.take());
                    } catch (InterruptedException e) {
                        System.out.println("Error while putting values in the Queue " 
                         + e.getMessage());
                    }
                }
            }
        }.start();        
        // Consumer thread
        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < cityNames.length; i++){
                    try {
                        System.out.println(" Consumer got - " + priortyBQ.take());
                    } catch (InterruptedException e) {
                        System.out.println("Error while retrieving value from the Queue " 
                         + e.getMessage());
                    }
                }
            }
        }.start();
    }
}