package LPIII;

import java.util.Scanner;

public class FibonacciNR {
        public static void main(String args[]) {
            int fnum, a = 1, previous_a = 0, current, i;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of terms :");
            fnum = sc.nextInt();


            for(i = 0; i < fnum; i++){
                if(i < 2){
                    current = i;
                } else {
                    current = a + previous_a;
                    previous_a = a;
                    a = current;
                }
                System.out.print(current + " ");
            }
        }
    }

