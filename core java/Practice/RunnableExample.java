package Practice;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        // Thread constructor me Runnable object pass karte hain
        Thread t = new Thread(obj);

        t.start();
    }
}