package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MuRunnableImpl2 runnable2 = new MuRunnableImpl2();
        Thread thread1 = new Thread(runnable2);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter2{
    volatile static int count2 = 0;
}
class MuRunnableImpl2 implements Runnable{
    private void doWork2(){
        System.out.println("Ura!!! " + Thread.currentThread().getName());
    }
    private void doWork1(){
        doWork2();
        synchronized(this){
        Counter2.count2++;
        System.out.println(Counter2.count2 );
    }}

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
