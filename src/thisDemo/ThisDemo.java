package thisDemo;

/**
 *              THIS KEYWORD
 *
 * 1) Used to call current class instance variable
 * 2) Used to invoke current class method
 * 3) It invokes current class constructor.
 *
 * Rule: This statement should be first.
 */

public class ThisDemo {
    private int id;
    private String name;
    private String address;

    public ThisDemo() {
        System.out.println("Default constructor.");
    }

    public ThisDemo(int i, int j) {
        this();
        System.out.println("In parameter constructor "+(i+j));
    }

    public void setValues(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(1, 10);
        obj.setValues(1, "ABC", "Pune");
        System.out.println("Id=>" + obj.id + " Name=>" + obj.name + " Address=>" + obj.address);
    }
}
