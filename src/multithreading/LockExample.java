package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread = new Thread (new Runnable(){
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread1 = new Thread (new Runnable(){
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread2 = new Thread (new Runnable(){
            @Override
            public void run() {
                call.whatsappCall();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
    }
}
class Call{
    public Lock lock = new ReentrantLock();
    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile Call starts");
            Thread.sleep(3000);
            System.out.println("Mobile Call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("skypeCall starts");
            Thread.sleep(5000);
            System.out.println("skypeCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void whatsappCall(){
        lock.lock();
        try {
            System.out.println("whatsapp Call starts");
            Thread.sleep(7000);
            System.out.println("whatsapp Call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}