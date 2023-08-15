package superdemo;

/**
 * 1) It refers to immediate parent class variable.
 * 2) It refers immediate parent class method.
 * 3) It refers to parent class constructor. -> Constructor is called even if super keyword is not mentioned
 */

public class SuperA {
    int i=2;

   public void show(){
       System.out.println("In Super Show");
   }

   public SuperA(){
       System.out.println("In Super A constructor.");
   }
    public SuperA(int j){
        System.out.println("In Super A parameter constructor.");
    }
}

class SuperB extends SuperA{
    int i=4;

    public void show(){

        System.out.println("In show "+ super.i);
    }

    public SuperB(){
        super();
        System.out.println("In Super B constructor");
    }

    public SuperB(int j){
        System.out.println("In Super B parameter constructor");
    }
    public void display(){
        super.show();


    }
    public static void main(String[] args) {
        SuperB obj=new SuperB(9);
//        obj.display();

    }
}
