package j2.chap06;

import static j2.chap06.Data.change;

public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x );
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
}

class Data {
    int x;
    static void change(int x){
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}




