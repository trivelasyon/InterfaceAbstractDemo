package InterfaceAbstract;

public abstract  class BaseCustomerManager implements IcustomerService {

    @Override
    public void Save(Customer customer) {
        System.out.println("Veritabanina kaydedildi:"+ customer.getFirstName());
    }
}
