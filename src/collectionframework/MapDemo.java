package collectionframework;

//Q. Multiple map should be iterated in one arraylist


import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"ABC");
        map.put(2,"PQR");
        map.put(3,"XYZ");

//        System.out.println(map);

        map.forEach((k,v)->{
            System.out.println(k+": "+v);
        });
    }
}
