package multithreading;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        Thread.yield();
        //it pauses current the current thread execution and gives chance to another thread.
        for (int i=1;i<5;i++){
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
    YieldDemo obj=new YieldDemo();
    obj.start();


        for (int i=1;i<5;i++){
            System.out.println("In main method");
        }
    }
}
