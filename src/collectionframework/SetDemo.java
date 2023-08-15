package collectionframework;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


//        Integer integer1=new Integer(10);
//        Integer integer2=new Integer(10);
//        Integer integer3=new Integer(10);
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);


        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(10);
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);


        SortedSet<Integer> set2=new TreeSet<>();
        set2.add(100);
        set2.add(301);
        set2.add(54);
        set2.add(250);
        set2.add(540);
        set2.add(160);
        set2.add(200);
        set2.add(350);


        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set2.tailSet(301));
        System.out.println(set2.headSet(301));
        System.out.println(set2.subSet(20,300));

    }
}

class EmployeeSet{
    int id;
    String name;
    String address;

    public EmployeeSet(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSet that = (EmployeeSet) o;
        return id == that.id && name.equals(that.name) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(id, name, address));
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "EmployeeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EmployeeSet employeeSet1=new EmployeeSet(1,"Ramesh","Pune");
        EmployeeSet employeeSet2=new EmployeeSet(1,"Ramesh","Pune");
        EmployeeSet employeeSet3=new EmployeeSet(1,"Ramesh","Pune");
        EmployeeSet employeeSet4=new EmployeeSet(1,"Ramesh","Pune");

        Set<EmployeeSet> set=new HashSet<>();
        set.add(employeeSet1);
        set.add(employeeSet2);
        set.add(employeeSet3);
        set.add(employeeSet4);

        System.out.println(set);
    }


}
