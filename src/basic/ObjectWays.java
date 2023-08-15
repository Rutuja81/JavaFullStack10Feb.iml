package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {

    public  void  show(){
        System.out.println("In show");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        ObjectWays obj = new ObjectWays();
        obj.show();

        ObjectWays obj1 = ObjectWays.class.newInstance();
        obj1.show();

        Constructor<ObjectWays> obj2 = ObjectWays.class.getConstructor();
        ObjectWays obj3 = obj2.newInstance();
        obj3.show();
    }
}
