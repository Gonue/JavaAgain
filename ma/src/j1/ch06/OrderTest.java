package j1.ch06;

public class OrderTest {
    public static void main(String[] args) {
     Order myOrder = new Order();
     myOrder.orderNumber = "12345";
     myOrder.customerPhone = "01012345678";
     myOrder.customerAddress = "서울시 강남구 역삼동 111-333";
     myOrder.oderDate = "20201102";
     myOrder.oderTime = "130258";
     myOrder.Price = "35000";
     myOrder.menuId= "0003";
     myOrder.showOrderDetail();
     System.out.println("----------------------------------");
     Order newOrder = new Order("1","2","3","4","5","6","7");
      newOrder.showOrderDetail();
    }
}
