package java8;

interface MyInterface7 {
    static int sub(int a, int b) {
        return a - b;
    }

    String msg();

    default int add(int i, int j) {
        return i + j;
    }
}

interface MyInterface8{
    default int add(int i, int j){
        return i+j;
    }
}

public class DefaultStaticDemo implements MyInterface7,MyInterface8{
    public static void main(String[] args) {
        DefaultStaticDemo obj = new DefaultStaticDemo();
        System.out.println(obj.add(8, 7));
        System.out.println(MyInterface7.sub(10, 6));


    }

    @Override
    public String msg() {
        return null;
    }

    @Override
    public int add(int i, int j) {
        return MyInterface7.super.add(i, j);
    }
}
