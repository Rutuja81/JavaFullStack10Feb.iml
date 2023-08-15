package polymorphism;


/**
 *
 * Polymorphism->one form to many form.
 *
 * method overloading-> same class with same method name but different parameters.
 */
public class Addition {
    public int add(int a, int b){
        return a+b;
    }

    public float add(float a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Addition addition= new Addition();
        System.out.println(addition.add(1,6));
        System.out.println(addition.add(2.8f,5,7));
    }
}
