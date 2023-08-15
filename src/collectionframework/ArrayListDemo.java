package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//  arraylist stores duplicate values
//arraylist maintains insertion order
//arraylist uses dynamic array to store elements
//it grows and shrinks automatically

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = new int[60];
        arr[0] = 90;
        arr[1] = 90;
        arr[2] = 90;


        ArrayList<Employee> list1 = new ArrayList<>();
        Employee employee = new Employee(1, "Ramesh", "Pune");
        Employee employee2 = new Employee(2, "Ramesh", "Pune");
        Employee employee3 = new Employee(3, "Ramesh", "Pune");
        Employee employee4 = new Employee(4, "Ramesh", "Pune");

        list1.add(employee);
        list1.add(employee2);
        list1.add(employee3);
        list1.add(employee4);


        for (Employee employee1 : list1) {
            System.out.println(employee1.id + " " + employee1.name + " " + employee1.address);
        }


        List<Integer> list = Arrays.asList(1, 2, 4, 4, 5);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));

        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 4, 3));

        List<Integer> list4 = new ArrayList<>() {{
            add(10);
            add(30);
            add(60);
        }};

    }
}

class Employee {
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
