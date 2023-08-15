package java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {
        MyInterface6 myInterface6 = Sample::new;
        myInterface6.sample();

    }

    public MethodRefToConstructor(){
        System.out.println("In method ref const");

    }
}

class Sample{
    public Sample(){
        System.out.println("In Sample const");
    }
}

interface MyInterface6{
    Sample sample();

}
