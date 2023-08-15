package encapsulation.encapsulationDemo;

/**
 * encapsulation: wrapping data in single unit.
 *                making field private and giving access to it via getters and setters.
 */

public class EncapsulationDemo {
    private int id;
    private String name;
    private String address;

    public void setId(int id){
        if(id==0){
            System.out.println("Id is 0 ");
        }else {
            this.id=id;
        }
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj= new EncapsulationDemo();
        System.out.println("Id=>");
    }
}
