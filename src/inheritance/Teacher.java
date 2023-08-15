package inheritance;




/**
 * inheritance-> acquiring properties of base class to derived class.
 *
 * advantage-> code re-usability.
 *
 * */

public class Teacher {    //ParentClass, SuperClass, BaseClass
    int id;
    String Name;
    String address;
}

class MathsTeacher extends Teacher{    //ChildClass, SubClass, derivedClass
    public static void main(String[] args) {
        MathsTeacher obj=new MathsTeacher();
        obj.id=1;
        obj.Name="ABC";
        obj.address="Pune";
        System.out.println(obj.id + obj.address + obj.Name);
    }
}

class PhysicsTeacher extends Teacher{
    public static void main(String[] args) {
        PhysicsTeacher obj=new PhysicsTeacher();
        obj.id=1;
        obj.Name="ABC";
        obj.address="Pune";
    }
}
