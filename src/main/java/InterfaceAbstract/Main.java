package InterfaceAbstract;

import java.time.format.DateTimeFormatter;

public class Main {

        public static void main(String[] args) {
            Customer customer = new Customer(1,"hakan","ozel","189", DateTimeFormatter.ofPattern("25-09-1992 00:00:00"));

            BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
            customerManager.Save(customer);
        }
    }

