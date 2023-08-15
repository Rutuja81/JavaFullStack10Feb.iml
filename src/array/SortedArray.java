package array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={7,3,2,6,8,5,9,4,10,1};
        int count=0;
        for (int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    count=arr[i];
                    arr[i]=arr[j];
                    arr[j]=count;
                }
            }

            System.out.println(arr[i]);
        }

    }
}
