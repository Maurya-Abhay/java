package Practice;

class MyThread extends Thread {

    public void run() {
        // run() method thread ka actual task hota hai
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        // start() new thread create karta hai
        t1.start();

        // Main thread bhi chal raha hota hai
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
