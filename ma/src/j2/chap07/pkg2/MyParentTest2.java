package j2.chap07.pkg2;

import j2.chap07.pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers(){
//        System.out.println(prv); 에러
//        System.out.println(dft); 에러
        System.out.println(prt); //같은패지키 + 자손
        System.out.println(pub); // OK
    }

}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv);  전부 다른 패키지 다른 클래스
//        System.out.println(p.dft);
//        System.out.println(p.prt);
        System.out.println(p.pub); // OK
    }
}
