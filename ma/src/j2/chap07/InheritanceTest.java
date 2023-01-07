package j2.chap07;

class Point extends Object{
    int x;
    int y;
}

//class Circle extends Point {
//    int r;
//}
//상속

class Circle extends Object{ // 포함
    Point p = new Point();
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 10;
        c.p.y = 20;
        c.r = 3;
        System.out.println(c.p.x);
        System.out.println(c.p.y);
        System.out.println(c.r);
        System.out.println(c.toString());
        System.out.println(c);
    }
}
