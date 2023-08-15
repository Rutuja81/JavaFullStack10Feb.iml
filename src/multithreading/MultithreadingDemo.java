package multithreading;

/**
 * Multithreading can be achieved by using 2 methods
 * 1) extending Thread
 * 2) implementing Runnable
 *
 *
 * Multithreading improves performance as multiple thread executes simultaneously.
 *
 * imp: to achieve multithreading run() method should be override.
 */

public class MultithreadingDemo extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i=0;i<5;i++){
            System.out.println("hii");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();  //to start thread

    }
}


/**
 * implementing Runnable method
 */

class MultiDemo{

    public static void main(String[] args) {

        Thread thread=new Thread(()->{           //lambda method
            System.out.println(Thread.currentThread().getName());
            for (int i=0;i<5;i++) {
                System.out.println("hii");
            }
        });
        thread.start();
    }
}
