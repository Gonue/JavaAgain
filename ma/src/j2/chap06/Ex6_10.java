package j2.chap06;

public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3,3));
    }
}

class MyMath3{
    long add(int a, long b){
        System.out.print("sdf");
        return a+b;
    }
}