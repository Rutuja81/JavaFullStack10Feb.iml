package controlflowstatments;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        int a,b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value of a: ");
//        a= scanner.nextInt();
//        System.out.println("Enter value of b: ");
//        b= scanner.nextInt();
//        int c=a+b;
//        System.out.println("Addition of numbers is: "+c);




        int num, sum = 0;
        char choose;
        Scanner scanner1 = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            num = scanner1.nextInt();
            sum = sum + num;
            System.out.println("do you want to continue");
            choose = scanner1.next().charAt(0);

        } while (choose == 'y' || choose == 'Y');
        System.out.println("Your sum is: " + sum);



    }
}
