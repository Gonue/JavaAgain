package j2.chap07;

class Point3{
    int x;
    int y;
    String getLocation(){
        return "x:" + x + ", y: " + y;
    }
}
class Point3D3 extends Point3{
    int z;
    String getLocation(){
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
    //조상의 getLocation()을 오버라이딩
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D3 p = new Point3D3();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p);
    }
}
