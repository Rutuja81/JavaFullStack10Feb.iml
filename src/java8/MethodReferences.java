package java8;

interface MyInterface4 {
    void msg();

}

public class MethodReferences {
    public static void main(String[] args) {
        //method reference to instance method
        MethodReferences obj = new MethodReferences();
        //refer
        MyInterface4 myInterface4 = obj::show;
        //call
        myInterface4.msg();

    }
    public void show() {
        System.out.println("In show method");
    }
}
