package stringdemo;

import java.util.HashMap;
import java.util.Map;


public class CountWords {
    public static void main(String[] args) {
        String str="I am Developer and Engineer".replaceAll("\\s","");
        String[] strings=str.split(" ");
//        char[] chars=str.toCharArray();
        Map<String,Integer> map=new HashMap<>();

        for (String st:strings){
            if (map.containsKey(st)){
                map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        System.out.println(map.entrySet());
    }
}
