package j2.chap06;

public class Ex6_9 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
    }
}


class MyMath2{
    long a, b;

    long add(){
        return a + b;
    }

    static long add(long a, long b){
        return a + b;
    }
}
