package java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String str = "welcome";

        Function<String,String> function = s->s.concat(" in Pune!");
        Function<String,String> function1=String::toUpperCase;
        System.out.println(function1.andThen(function).apply(str));
    }
}
