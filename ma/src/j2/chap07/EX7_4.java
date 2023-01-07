package j2.chap07;

class Point1{
    int x;
    int y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point1(){}
}
class Point3D extends Point1{
    int z;
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void print() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class EX7_4 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        p3.print();

    }
}
