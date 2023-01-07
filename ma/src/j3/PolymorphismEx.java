package j3;

public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());
        System.out.println("현재 잔액은 " + customer.money +"원 입니다.");
    }
}


class Coffee{
    int price;

    Coffee(){}

    public Coffee(int price){
        this.price = price;
    }
}
class Americano extends Coffee{
    public Americano(){
        super(4000);
    }
    public String toString() { return "아메리카노";}
}

class CaffeLatte extends Coffee{
    public CaffeLatte(){
        super(5000);
    }
    public String toString(){ return "카페라떼";}
}
class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "(" + coffee.price +"원)" +"를 구입했습니다.");
    }
}
