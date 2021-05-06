package InterfaceAbstract;

public class CustomerCheckManager implements InterfaceAbstract.ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(InterfaceAbstract.Customer customer) {
        return true;
    }
}
