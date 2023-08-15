package exceptionhandling;

/**
 *   Unchecked exception can be propagated
 *   checked exception cannot be propagated
 */

public class ExceptionPropagation {

    public void a(){
        int i=10/0;
    }

    public void b(){
        a();
    }

    public void c(){
        try {
            b();
        }catch (Exception e){
            System.out.println(e);
//            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExceptionPropagation obj= new ExceptionPropagation();
        obj.c();
    }
}
