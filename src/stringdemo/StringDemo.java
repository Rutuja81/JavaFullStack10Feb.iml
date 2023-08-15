package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
    char[] arr={'w','e','l','c','o','m','e'};
//    String str=new String(arr);
//    String str1=new String("red");//2 obj
//
//    String str2=new String("green");//2
//    String str3="red";//1
//    String str4="yellow";//1
//    String str5="green";//0
//    String str6=new String("yellow");//1
//    String str7=new String("red");//1

        String str="Mumbai";
        String str1="Mumbai";
        String str2="Mumbai";
        String str3="Mumbai";

        String s1=str.concat(" is capital of Maharashtra");
        System.out.println(s1);

    }
}
