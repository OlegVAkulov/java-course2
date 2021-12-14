package multithreading;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class cashMachine {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Oleg", lock);
        new Employee("Petr", lock);
        new Employee("Tatyana", lock);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Employee("Semen", lock);
        new Employee("Elena", lock);
        new Employee("Mariya", lock);
    }

}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run(){
        if (lock.tryLock()){
//        System.out.println(name + " waiting....");
//        lock.lock();
        System.out.println(name + " uses the ATM");
        try {
            Thread.sleep(2000);
            System.out.println(name + " finished use the ATM");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }
        else {
            System.out.println(name + " waiting....");

        }
}}