package finaldemo;

/**
 *   Final Keyword
 *
 *  1) Final Variable=> You cannot reassign the value to the final variable.
 *  2) Final Method=> You cannot override the final method in child class.
 *  3) Final Class=> You cannot inherit the final class
 */

public final class FinalDemo {

    final int i;// constant
    final String direction1="North";
    final float pi=3.142f;
    //We can declare final variable and can give it value using constructor only once.
    public FinalDemo(){
        i=9;
    }

    public final void show(){
        System.out.println(i);
        System.out.println(pi);

    }

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
        obj.show();
        System.out.println(obj.direction1);
    }
}
