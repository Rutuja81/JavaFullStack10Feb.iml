package java8;

//Lambda Expression=> Anonymous function

/**
 * use=> it takes less code
 *       it implements functional interface
 */

public class LambadaExpression {
    public static void main(String[] args) {

        MyInterface myInterface=(i,j)-> {
                System.out.println("In Add");

        };
        myInterface.add(2,5);



    }
}


@FunctionalInterface
interface MyInterface{
    void add(int i,int j);
}
