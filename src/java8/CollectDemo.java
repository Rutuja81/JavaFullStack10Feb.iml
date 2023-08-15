package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 2, 36, 94, 55, 6, 27, 18, 9);

        Predicate<Integer> predicate1 = p -> p < 6;

//        Set<Integer> list1=list.stream().filter(predicate1).collect(Collectors.toSet());
//
//        System.out.println(list1);

        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);
    }
}
