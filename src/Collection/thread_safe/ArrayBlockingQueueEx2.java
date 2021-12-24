package collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue =
                new ArrayBlockingQueue<>(4);
        new Thread(()->{
           int i = 0;
           while (true){
               try {
                   arrayBlockingQueue.put(++i);
                   System.out.println("Producer add number: " + i + " " + arrayBlockingQueue);
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer take number: " + j + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }
}
