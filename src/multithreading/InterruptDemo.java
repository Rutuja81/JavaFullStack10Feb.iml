package multithreading;

public class InterruptDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<5;i++){
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
        InterruptDemo obj=new InterruptDemo();
        obj.start();
        obj.interrupt();
        System.out.println(obj.isInterrupted());

        for (int i=1;i<5;i++){
            System.out.println("In main method");
        }

    }
}
