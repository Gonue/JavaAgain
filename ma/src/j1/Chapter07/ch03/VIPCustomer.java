package j1.Chapter07.ch03;

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
        System.out.println("VIPCustomer(int, string) 호출 ");
    }
    public int getAgentID(){
        return agentID;
    }
}
