package exceptionhandling;

/**
 * THROWS: Declare Exception
 *
 * THROW: throw exception.
 *
 * Importance:
 * For Security
 *
 * */

public class ThrowAndThrows{

    public static void main(String[] args) throws Exception{
        int age=15;

//        try {
//
//            if (age>=18){
//                System.out.println("You can vote!");
//            }else {
//                throw new Exception("You cannot vote!");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        if (age>=18){
            System.out.println("You can vote!");
        }else {
            throw new Exception("You cannot vote!");
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
}

/**
 *             Throw                           |               Throws
 *                                             |
 *  1) Throw is used to throw exception        |   1) Throws is used to declare exception.
 *  2) Throw is used within a method           |   2) Throws is used with method signature.
 *  3) You can throw only one exception        |   3) You can declare multiple exception
 *     with one throw keyword                  |      using one Throws keyword.
 *  4) throw is used with new instance         |   4) throws is used with class instance.
 */
