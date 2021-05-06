package Inheritance;

public class CustomerManager {
    public void add(Customer customer){
     System.out.println("customer eklendi : " +customer.customerNumber);
    }
    //bulk operasyonu
    public void addMultiple(Customer[] customers){
     for(Customer cust : customers){
         add(cust);
     }
    }
}
