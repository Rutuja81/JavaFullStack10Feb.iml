package collectionframework;

import java.util.*;
import java.util.ArrayList;

public class MapArrayListDemo {
    public static void main(String[] args) {

        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"ABC");
        map1.put(2,"PQR");
        map1.put(3,"XYZ");

        Map<Integer,String> map2=new HashMap<>();
        map2.put(1,"ABC");
        map2.put(2,"PQR");
        map2.put(3,"XYZ");

        Map<Integer,String> map3=new HashMap<>();
        map3.put(1,"ABC");
        map3.put(2,"PQR");
        map3.put(3,"XYZ");


        List<Map<Integer,String>> list=Arrays.asList(map1,map2,map3);

        list.forEach(s->
                s.forEach((k,v)->{
                    System.out.println(k+""+v);
                }));

    }
}
