package anonymousinnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

//        Add add=new Add() {
//            @Override
//            public int addition(int a, int b) {
//                return a+b;
//            }
//
//
//        };
//        System.out.println(add.addition(4,5));
//        System.out.println(add.substraction(8,2));


        Add add=(a,b)->a+b;      //if only interface has one method

        System.out.println(add.addition(4,6));
    }
}


interface Add{
    int addition(int a, int b);
//    default int substraction(int i, int j){
//        return i-j ;
//    };
}
