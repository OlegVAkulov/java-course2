package multithreading;

public class InterruptionEx {
    public static void main(String[] args) {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main ends");


    }

}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (double i = 0; i < 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("thread is interrupted");
                System.out.println("thread is ok");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("Thread is sleep interrupted, thread stop!");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);

    }
}