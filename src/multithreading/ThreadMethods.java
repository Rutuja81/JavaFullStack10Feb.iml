package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {


            System.out.println(Thread.currentThread().getName());

            Thread t1 = new Thread(()->{
                System.out.println(Thread.currentThread().getName());

//            System.out.println(Thread.currentThread().isAlive());
//            try {
//                Thread.sleep(4000);
//                System.out.println("In t1 :"+ Thread.currentThread().getState());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            });
//        t1.setName("Test-1");
//        t1.setDaemon(true);
            System.out.println("before the start : "+t1.getState());
            t1.start();

            System.out.println("After the start : "+t1.getState());

            //        System.out.println(t1.getName());

//        Thread t2 = new Thread(()->{
//            System.out.println(Thread.currentThread().getName());
//
//        });
//        t2.setName("Test-2");
//        t2.start();

//        System.out.println(t1.isAlive());
//        System.out.println(t1.isDaemon());

            System.out.println("Last of program : "+t1.getState());

        }
}
