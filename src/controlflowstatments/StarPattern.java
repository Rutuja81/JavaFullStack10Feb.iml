package controlflowstatments;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

        /**
         *   * * * *
         *   * * * *
         *   * * * *
         *   * * * *
         */
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        /**
         *     * * * *
         *     * * *
         *     * *
         *     *
         */

        for (int i=1; i<=4; i++){
            for (int j=i; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /**
         *      *
         *      * *
         *      * * *
         *      * * * *
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        /**
         *      1
         *    2   3
         *  4   5   6
         */

        int count=1;

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + count++);
            }
            System.out.println();

        }


        System.out.println();


        int count1=16;

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                if (count1<10){
                    System.out.print(" 0" + count1--);
                }else System.out.print(" " + count1--);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + count++);
            }
            System.out.println();

        }

        System.out.println();

        /**
         * 16 15 14 13
         * 12       09
         * 08       05
         * 04 03 02 01
         */

        int count2=16;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i > 1 && i < 4 && j > 1 && j < 4) {
                    System.out.print("   ");
                    count2--;
                } else {
                    if (count2<10){
                        System.out.print(" 0" + count2--);
                    }else System.out.print(" " + count2--);

                }

            }
            System.out.println();
        }

        System.out.println();


        /**
         * 01 02 03 04
         * 12       05
         * 11       06
         * 10 09 08 07
         */

        int count4=1;
        for (int i=1;i<=4;i++){
            for (int j = 1; j <= 4; j++) {
                if (i > 1 && i < 4 && j > 1 && j < 4) {
                    System.out.print("   ");
                } else {
                        if (count4<10){
                            System.out.print(" 0" + count4++);
                        }else System.out.print(" " + count4++);
                    }
            }
            System.out.println();
        }


        /**
         *
         */

        System.out.println("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int value = 1;
        int minCol = 0;
        int maxCol = n-1;
        int minRow = 0;
        int maxRow = n-1;

        while (value <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                arr[minRow][i] = value;
                value++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                arr[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                arr[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                arr[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}







