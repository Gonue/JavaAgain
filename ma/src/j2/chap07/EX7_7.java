package j2.chap07;

public class EX7_7 {
    public static void main(String[] args) {
        Car car = null;

        FireEngin fe = new FireEngin();
        FireEngin fe2 = (FireEngin) car;
        Car car2 = (Car)fe2;
    }
}

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("Drive");
    }
    void stop(){
        System.out.println("Stop");
    }
}

class FireEngin extends Car {
    void water(){
        System.out.println("Water");
    }
}
