package LPIII;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class FractionalKnapSack {

    private static double getMaxValue(ItemValue[] arr, int capacity) {

        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double com1 = item1.profit / item1.weight;
                double com2 = item2.profit / item2.weight;

                if (com1 < com2)
                    return 1;
                else
                    return -1;
            }
        });

        double totalValue = 0d;

        for (ItemValue i : arr) {

            int cWt = i.weight;
            int cVal = i.profit;

            if (capacity - cWt >= 0) {

                capacity = capacity - cWt;
                totalValue += cVal;
            } else {
                double fraction = (capacity / cWt);
                totalValue += (cVal * fraction);
                capacity = (int) (capacity - (cWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        ItemValue[] arr = { new ItemValue(60, 10),
                            new ItemValue(100, 20),
                            new ItemValue(120, 30),
                            new ItemValue(80, 35),
                            new ItemValue(12, 40),
        };
//        ItemValue[] arr = new ItemValue[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter the weight of item " + (i + 1) + ": ");
//            int weight = scanner.nextInt();
//
//            System.out.print("Enter the value of item " + (i + 1) + ": ");
//            int value = scanner.nextInt();
//
//            arr[i] = new ItemValue(weight, value);
//        }


//        int capacity = 50;
//
//        double maxValue = getMaxValue(arr, capacity);

//
//        System.out.println(maxValue);

        System.out.print("Enter the knapsack capacity: ");
        int capacity = scanner.nextInt();
        scanner.close();

        double totalValue = getMaxValue(arr, capacity);

        System.out.println("Total value in the knapsack: " + totalValue);
    }

    static class ItemValue {

        int profit, weight;

        public ItemValue(int val, int wt) {
            this.weight = wt;
            this.profit = val;
        }
    }
}

