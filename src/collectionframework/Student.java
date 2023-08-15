package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Prakash", "Pune");
        Student obj2 = new Student(2, "Namrata", "Pune");
        Student obj3 = new Student(3, "Sagar", "Pune");
        Student obj4 = new Student(4, "Sakshi", "Pune");

        List<Student> list1 = new ArrayList<>();
        list1.add(obj2);
        list1.add(obj1);
        list1.add(obj3);
        list1.add(obj4);

        Collections.sort(list1);

        list1.forEach(s -> {
            System.out.println(s);
        });


    }

//    @Override
//    public int compareTo(Student o) {
//        if (o.id == this.id) {
//            return 0;
//        } else if (o.id > this.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
