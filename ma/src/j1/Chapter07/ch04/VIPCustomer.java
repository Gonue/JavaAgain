package j1.Chapter07.ch04;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

//    public VIPCustomer(){
//        super();
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIP Coustomer() 호출");
//    }
    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }


    public int getAgentID(){
        return agentID;
    }
}
