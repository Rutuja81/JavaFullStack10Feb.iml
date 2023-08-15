package constructor;

/**
 * Constructor: It is special type of function which invokes
 *              automatically when you create object of class.
 *
 * RULES
 * 1) Your class name and constructor name should be same.
 * 2) Constructor has no return type.
 * 3) Static, Final, Synchronized keywords are not used.
 *
 *
 * TYPES OF CONSTRUCTOR
 * 1) Default Constructor
 * 2) Parameterised Constructor
 *
 * USES
 * To initiate to default value
 *
 * CONSTRUCTOR OVERLOADING: bcoz we can create unlimited constructor with different parameters.
 */

public class ConstructorDemo {
    char ch;

    public ConstructorDemo(){
        System.out.println("In Default Constructor");
    }

    public ConstructorDemo(int i){
        System.out.println(this.ch);
        System.out.println("In Parameterised Constructor.");
    }

    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo();
        ConstructorDemo obj1=new ConstructorDemo(9);
    }

}
