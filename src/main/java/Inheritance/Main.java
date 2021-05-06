package Inheritance;

public class Main {
    public static void main (String [] args) {
        IndividualCustomer engin= new IndividualCustomer();
        engin.customerNumber="11";
        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="12";
        SendikaCustomer sendika=new SendikaCustomer();
        sendika.customerNumber="13";
        CustomerManager Cm=new CustomerManager();
        Customer [] customers={engin,sendika,hepsiBurada};
      //  Cm.add(engin);
      //  Cm.add(hepsiBurada);
        Cm.addMultiple(customers);



    }
}
