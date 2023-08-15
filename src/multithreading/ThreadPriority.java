package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("In thread 1");
            }
        });
        t1.setPriority(1);
        t1.start();

        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("In thread 2");
                System.out.println(Thread.currentThread().getPriority());
            }
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getId());
        t2.start();
    }
}
