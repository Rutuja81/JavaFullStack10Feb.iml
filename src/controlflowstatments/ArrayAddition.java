package controlflowstatments;

public class ArrayAddition {
    public static void main(String[] args) {

//       int sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
//
//
//
//        for (int i=0;i<arr.length-2;i++){
//            if (105<= (arr[i] & arr[i+1]) && (arr[i] & arr[i+1])>=100) {
//                System.out.println(arr[i]+arr[i+1]);
//            }
//
//            }

        /**
         * Even Number
         */

        int[] arr={100,108, 109,104,113,45,3,4};

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

        System.out.println();

        /**
         *  odd number
         */
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }


    }
}
