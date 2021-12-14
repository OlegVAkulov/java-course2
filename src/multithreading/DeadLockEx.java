package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread10 = new Thread10();
        Thread thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}
class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10:  монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10:  мониторы объектов lock2 и lock1 захвачены");
            }
        }
    }
}
class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread20:  монитор объекта lock1 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread20:  мониторы объектов lock2 и lock1 захвачены");
            }
        }
    }
}