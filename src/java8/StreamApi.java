package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Stream Api: It is sequence of object and have many methods, we combine that method for producing desire
 * types: Sequential and parallel(for multithreading)
 *
 * operations->
 * terminal->forEach(), reduce(), collect()
 * intermediate-> map(function), filter(predicate), sorted
 */

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);



        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        Function<Integer,Boolean> function1 =(Integer integer)->integer>10;


        System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9).max().getAsInt());



        list.stream().map(function.andThen(function1)).forEach(System.out::println);


    }
}
