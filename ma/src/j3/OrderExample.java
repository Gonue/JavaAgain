package j3;

public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();
        cafeowner.giveItem(a);
        cafeowner.giveItem(b);
    }
}
