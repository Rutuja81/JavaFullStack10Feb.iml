package stringdemo;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am a developer and I am also Engineer";

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res.concat(String.valueOf(str.charAt(i)));
        }
//        System.out.println(res);

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
    }
}

class ReverseString2{
    public static void main(String[] args) {
        String str="I am Developer and Engineer";
        String[] strings=str.split(" ");

        for (int i= strings.length-1;i>=0;i--){
            System.out.println(strings[i]);
        }
    }
}
