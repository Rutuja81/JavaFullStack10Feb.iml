package collectionframework;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(56);
        list1.add(33);
        list1.add(77);


        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(10);
        list1.add(56);
        list1.add(45);
        list1.add(46);

//        System.out.println(list1);
//        System.out.println(list1.size());
//        System.out.println(list1.isEmpty());
//        System.out.println(list1.get(3));

        System.out.println(list1.addAll(list2));
        System.out.println(list1.remove(list2));
        System.out.println(list1.retainAll(list2));
    }
}
