package abstractDemo;

public abstract class AbsSport {
    public abstract void play();

    public void exercise(){
        System.out.println("Exercise");
    }
}


/**
 *       Abstract Class                                            Interface
 *  1) abstract class have both abstract and          1)only  abstract method(default and static after java 8)
 *     non-abstract(concrete) method.
 *
 *  2) we have private, protected and public          2)Only Public (Default after java 9)
 *     methods.
 *
 *  3)abstract class can implement interface          3) only implements.
 *    or extends another class
 *
 *  4) partial abstraction.                           4)100% abstraction
 */