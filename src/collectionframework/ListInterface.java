package collectionframework;

/**
 *  If reference variable of interface is taken then only methods declared in interface will be called.
 *
 */

public interface ListInterface {
    public void show();
    public void display();
}

class ArrayList implements ListInterface{
    @Override
    public void display() {
        System.out.println("In display");
    }

    @Override
    public void show() {
        System.out.println("In show");
    }

    public void add(){
        System.out.println("In add method");
    }

    public static void main(String[] args) {
        ArrayList obj= new ArrayList();
        obj.add();
        obj.display();
        obj.show();
    }
}


