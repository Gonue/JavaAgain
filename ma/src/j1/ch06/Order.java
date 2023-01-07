package j1.ch06;

public class Order {
    public String orderNumber;
    public String customerPhone;
    public String customerAddress;
    public String oderDate;
    public String oderTime;
    public String Price;
    public String menuId;

    public Order(){}
    public Order(String orderNumber, String customerPhone, String customerAddress, String oderDate, String oderTime, String Price, String menuId){
        this.orderNumber = orderNumber;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.oderDate = oderDate;
        this.oderTime = oderTime;
        this.Price = Price;
        this.menuId = menuId;
    }
    public void showOrderDetail(){
        System.out.println("주문 접수 번호 : "+ orderNumber);
        System.out.println("주문 핸드폰 번호 : "+ customerPhone);
        System.out.println("주문 집 주소 : "+ customerAddress);
        System.out.println("주문 날짜 : "+ oderDate);
        System.out.println("주문 시각 : "+ oderTime);
        System.out.println("주문 가격 : "+ Price);
        System.out.println("메뉴 번호 : " + menuId);
    }

    public static void main(String[] args) {
        Order myOrder = new Order("1","2","3","4","5","6","7");
        myOrder.showOrderDetail();
    }
}
