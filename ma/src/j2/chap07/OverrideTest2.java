package j2.chap07;


class MyPoint3 extends Object{
    int x;
    int y;

    MyPoint3(int x, int y){
        this.x = x;
        this.y = y;
    }
    MyPoint3(){}
    public String toString(){
        return "x:"+x+", y:"+y;
    }
}

public class OverrideTest2 {
    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3();
        MyPoint3 p1 = new MyPoint3(3,5);
        p.x = 3;
        p.y = 5;
//        System.out.println(p.x);
//        System.out.println(p.y);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p1);
    }
}
