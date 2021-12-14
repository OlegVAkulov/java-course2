package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market stuff come to work");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void everythingIsReady() {
        try {
            Thread.sleep(3000);
            System.out.println("Everything is ready, so let's open the market");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openMarket() {
        try {
            Thread.sleep(4000);
            System.out.println("Market is open");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Friend("Oleg", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Petr", countDownLatch);
        new Friend("Natalya", countDownLatch);
        new Friend("Tatyana", countDownLatch);
        new Friend("Marya", countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();

    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " it is shopping");
            ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}