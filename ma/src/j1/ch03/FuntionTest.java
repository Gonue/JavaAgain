package j1.ch03;

public class FuntionTest {
    public static int addNum(int num1, int num2){
        int result;
        result = num1 + num2;
        return  result;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }

    public static int calcSum(){
        int sum = 0;
        int i;
        for(i = 0; i<=100; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int sum = addNum(num1, num2);
        System.out.println(sum);
        sayHello("안녕하세요");
        sum = calcSum();
        System.out.println(sum);

    }
}
