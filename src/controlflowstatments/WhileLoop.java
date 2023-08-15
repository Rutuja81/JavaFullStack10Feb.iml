package controlflowstatments;

/**
 * While loop will execute only if its condition is satisfied.
 *
 * Do while loop will execute atleast once even if condition is false
 */
public class WhileLoop {
    public static void main(String[] args) {

        int i=0;
        //while loop
        while (i<=10){
            System.out.println(i);
            i++;
        }


        // do while loop
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
