package collectionframework;

public class GenericClass<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass=new GenericClass<>();
        genericClass.setT(5);


        GenericClass<String> genericClass1=new GenericClass<>();
        genericClass1.setT("ABC");

        System.out.println(genericClass.getT());
        System.out.println(genericClass1.getT());

    }
}
