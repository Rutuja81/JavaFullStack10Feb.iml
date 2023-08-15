package abstraction.interfaceDemo;

/**
 * Hiding method and showing functionality
 */

public class Addition implements Operation {
    @Override
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    @Override
    public void sub(int i, int j) {
        System.out.println(i - j);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(5, 10);
        obj.sub(10, 6);
    }
}
