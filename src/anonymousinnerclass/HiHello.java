package anonymousinnerclass;

public class HiHello {
    public static void main(String[] args) {
        Thread hii = new Thread(()-> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread hello = new Thread(()-> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hii.start();
        hello.start();

        try {
            hii.join();
            hello.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bye");

    }
}

//class Hii{
//    public static void main(String[] args) {
//        Thread t1=new Thread(()->{
//            for (int i=0;i<5;i++) {
//                System.out.println("hii");
//            }
//        });
//        t1.start();
//    }
//}
//
//
//
//class Hello{
//    public static void main(String[] args) {
//        Thread t2=new Thread(()->{
//            for (int i=0;i<5;i++) {
//                System.out.println("hello");
//            }
//        });
//        t2.start();
//    }
//}
