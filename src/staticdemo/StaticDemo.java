package staticdemo;

/**
 * STATIC KEYWORD
 * Used to refer common property of all objects
 */

public class StaticDemo {
    static String companyName = "ABC";
    int id;
    String name;

    public StaticDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo(1, "Ravi");
        StaticDemo obj2 = new StaticDemo(2, "Rakesh");
        StaticDemo obj3 = new StaticDemo(3, "Suhas");

        System.out.println("id: " + obj1.id + " Name:" + obj1.name + " companyName:" + companyName);
        System.out.println("id: " + obj2.id + " Name:" + obj2.name + " companyName:" + companyName);
        System.out.println("id: " + obj3.id + " Name:" + obj3.name + " companyName:" + companyName);

    }
}
