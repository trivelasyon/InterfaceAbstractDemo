package oopIntro;

public class Main {
    public static void main (String [] args) {
        Product product1=new Product(1,"Lenovo",15000,"16gb",10);

        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo v-15");
        product2.setDetail("16 GB RAM");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        Category category1=new Category();
        category1.setId(1);
        category1.setName("içecek");

        Category category2=new Category();
        category2.setId(2);
        category2.setName("yiyecek");

        System.out.println(category1.getId() + " " +category1.getName());

        System.out.println(product2.getUnitPriceAfterDiscount());





    }
    }
