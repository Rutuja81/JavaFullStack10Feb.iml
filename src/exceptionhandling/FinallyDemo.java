package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
//            System.exit(1);     //exits the program
            int i = 10;
            int j = i / 0;
            System.out.println("In first Try block");

        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception=>" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception" + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("Exception=> " + e.getMessage());
        }finally {
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
        }
    }
}
