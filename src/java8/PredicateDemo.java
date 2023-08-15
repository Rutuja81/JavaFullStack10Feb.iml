package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicate1 = p -> p > 3;
        Predicate<Integer> predicate2 = p -> p < 6;
        list.stream().filter(predicate1.and(predicate2)).forEach(System.out::println);


//        list.stream().filter(p -> p %2== 0).forEach(System.out::println);


    }
}
