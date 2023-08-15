package exceptionhandling;



public class MethodOverriding {
    public void show() throws Exception {
        System.out.println("In show");
    }
}


class ChildClass extends MethodOverriding{

    @Override
    public void show() throws Exception {

    }

    public static void main(String[] args) {
        ChildClass obj=new ChildClass();
//        obj.show();
    }
}

/**
 * 1) if parent class declares no exception then child class declare only unchecked exception.
 * 2) if parent class declares exception then child class declares same or lower exception.
 * 3) if parent class declare exception then child class declare their child exception.
 *
 */