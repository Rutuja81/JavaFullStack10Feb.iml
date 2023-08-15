package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum=0;
        for (int i=0;i< list.size();i++){
            sum = sum+ list.get(i);
        }
//        for (Integer integer : list) {
//            sum = sum + integer;
//        }

//        System.out.println(sum);

        int i=list.stream().reduce(0,(a,b)->(a+b));

//        int j=list.stream().reduce(0,Integer::max);
//        System.out.println(i);
//        System.out.println(j);
//
//        System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9).reduce(0,Integer::max));


        List<String> stringList = Arrays.asList("Python","PHP","Django","JAvascript","FullStackJava");
        Optional<String> str = stringList.stream().reduce((w1,w2)->(w1.length()>w2.length()?w1:w2));
        System.out.println(str.get());



        String largeList=" ";
        for (int j=0;j<stringList.size();j++){
            if (stringList.get(j).length()>largeList.length()){
                largeList=stringList.get(j);
            }
        }
        System.out.println(largeList);



    }
}
