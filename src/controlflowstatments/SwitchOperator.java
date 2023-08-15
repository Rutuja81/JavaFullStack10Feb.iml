package controlflowstatments;

import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args) {
        int a,b;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for a & b: ");
        a= scanner.nextInt();
//        System.out.println("Enter value for b: ");
        b= scanner.nextInt();
        System.out.println("Enter your operator: ");
        operator=scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Your operator is wrong");
        }

    }
}
