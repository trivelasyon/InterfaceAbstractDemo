package InterfaceAbstract.Abstracts;

public abstract  class BaseCustomerManager implements InterfaceAbstract.IcustomerService {

    @Override
    public void Save(InterfaceAbstract.Customer customer) {
        System.out.println("Veritabanina kaydedildi:"+ customer.getFirstName());
    }
}
