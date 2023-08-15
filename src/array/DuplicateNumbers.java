package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
//        int[] arr={1,2,3,5,6,8,2,7,2,1};

        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        arr[4]=5;
        arr[5]=6;
        arr[6]=2;
        arr[7]=7;
        arr[8]=8;
        arr[9]=1;


        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }
            }
        }


//
//        int[] arr={1,2,3,1,2,4,1,5,6,2,8};
//
//        Set<Integer> set=new HashSet<Integer>();
//
//        for(int i=0;i<arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[i]==arr[j]){
//                    set.add(arr[i]);
//                }
//            }
//
//        }
//
//        System.out.println(set);
//
//
    }
}
