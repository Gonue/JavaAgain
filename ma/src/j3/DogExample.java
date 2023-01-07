package j3;



public class DogExample {
    public static void main(String[] args) {
        Animal1 dog = new  Dog();
        dog.sound();

        Cat1 cat = new Cat1();
        cat.sound();
        System.out.println(cat.Kind);
    }
}


abstract class Animal1{
    public String Kind;
    public abstract void sound();
}

class Dog extends Animal1{
    public Dog(){
        this.Kind = "포유류";
    }
    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat1 extends Animal1{
    public Cat1(){
        this.Kind = "포유류";
    }
    public void sound(){
        System.out.println("야옹");
    }
}

