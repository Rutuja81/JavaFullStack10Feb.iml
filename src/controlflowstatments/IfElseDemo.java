package controlflowstatments;

public class IfElseDemo {
    public static void main(String[] args) {
        int age=18;
        String nationality="indian";

        //Nested if
        if(age>=18){
            if(nationality=="Indian"){
                System.out.println("You can vote.");
            }else {
                System.out.println("Not Indian.");
            }
        }else{
            System.out.println("You cannot vote");
        }

        int a=10, b=20, c=30,d=40;
        //ladder if
        if(a>b && a>c && a>d){
            System.out.println("A is greater");
        }else if(b>c && b>d){
            System.out.println("B is greater");
        }else if(c>d){
            System.out.println("C is greater");
        }else{
            System.out.println("D is greater");
        }


        //Ternary operator
        int i=10;
        String str= i>=100?i + " is greater than 100": i + " is less than 100";
        System.out.println(str);
    }
}
