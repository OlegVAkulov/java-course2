package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Oleg", callBox);
        new Person("Petr", callBox);
        new Person("Ivan", callBox);
        new Person("Tatyana", callBox);
        new Person("Marya", callBox);

    }
}
class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run (){

        try {
            System.out.println(name + " wait...");
            callBox.acquire();
            System.out.println(name + " call a phone");
            sleep(2000);
            System.out.println(name + " ends a call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
