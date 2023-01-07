package j2.chap06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은" + t1.channel);
        System.out.println("t1의 channel 값은" + t2.channel);

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다");

        t2 = t1;
        System.out.println("t1의 channel 값은" + t1.channel);
        System.out.println("t1의 channel 값은" + t2.channel);

        t1.channelDown();
        System.out.println("t1의 channel 값은" + t1.channel);
        t2.channelUp();
        System.out.println("t2의 channel 값은" + t2.channel);

    }
}
