package j2.chap06;
public class Ex6_3 {

    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();

        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 "+ Card.height +"높이는 " + Card.width + " 입니다");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 "+ Card.height +"높이는 " + Card.width + " 입니다");
        System.out.println("c1의 width와 heigth를 각각 50, 80으로 변경 합니다.");
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 "+ Card.height +"높이는 " + Card.width + " 입니다");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 "+ Card.height +"높이는 " + Card.width + " 입니다");


    }
}


