package collectionframework;

import java.util.Vector;

//vector grows by 100% that's why it is slow

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        vector.add(90);
        vector.add(10);
//        vector.add(10);
//        vector.addElement(45);
//        vector.remove(Integer.valueOf(30));
//        vector.remove(8);


//        System.out.println(vector.capacity());
//        System.out.println(vector.listIterator());
//        System.out.println(vector);
        System.out.println(vector.lastElement());
//        System.out.println(vector.capacity());
    }
}
