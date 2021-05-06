package Interfaces;

public class  Main {
    public static void main (String [] args) {

        Logger [] loggers=new Logger[]{new DatabaseLogger(),new FileLogger()};
        CustomerManager sd = new CustomerManager(loggers);
        Customer customer=new Customer(1,"hakan","özel");
        sd.add(customer);

    }
}
