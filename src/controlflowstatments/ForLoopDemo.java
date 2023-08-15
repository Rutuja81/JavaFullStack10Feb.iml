package controlflowstatments;

import java.util.Arrays;
import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] j = new int[5];
        j[0] = 11;
        j[1] = 12;
        j[2] = 13;
        j[3] = 14;
        j[4] = 15;

        //traditional for loop
        for (int i=0;i<j.length;i++){
            System.out.println(j[i]);

        }

        for (int i=j.length-1;i>=0;i--){
            System.out.println(j[i]);
        }


        System.out.println();

        //enhanced for loop
        for (int i:j) {
            System.out.println(i);

        }

        System.out.println();

        List<Integer> list= Arrays.asList(3,4,343,4);
        list.forEach(s->{
            System.out.println(s);
        });




    }
}
