package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BiggestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int max = 0;
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i) > max) {
                max = list.get(i);

            }
        }

//        System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9).max().getAsInt());

    }
}
