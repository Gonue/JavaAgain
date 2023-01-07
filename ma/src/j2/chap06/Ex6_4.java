package j2.chap06;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L,3L); //add메서드 호출
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        long result5 = mm.max(3,5);
        System.out.println(result5);
        long result6 = mm.tiny(5,3);
        System.out.println(result6);
        System.out.println(mm.add(10,5));
        mm.printGugudan(9);
    }
}


class MyMath {
    long add (long a, long b){
        return a+b;
    }
    long subtract(long a, long b){
        return a-b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }
    long max(long a , long b){
        long result = 0;
        if(a>b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }
    long tiny(long a, long b){
        long result = 0;
        if(a > b){
            result = b;
        } else {
            result = a;
        }
        return  result;
    }
    void printGugudan(int dan){
        for(int i=1; i<=9; i++){
            if(!(2 <=dan && dan <=9)){
                return;
            }
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
    }
}
