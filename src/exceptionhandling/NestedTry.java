package exceptionhandling;

public class NestedTry {


    public static void main(String[] args) {

        try {
            int i = 10;
            int j = i / 0;
            System.out.println("In first Try block");

            try {
                System.out.println("In second try block ");
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception=>" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception=> " + e.getMessage());
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

    }


}
