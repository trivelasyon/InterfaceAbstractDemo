package InterfaceAbstract;



public class StarbucksCustomerManager extends BaseCustomerManager {


    private InterfaceAbstract.ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        this.customerCheckService=customerCheckService;
    }

    @Override
    public void Save(Customer customer){
        if(customerCheckService.CheckIfRealPerson(customer)){
        super.Save(customer);
    }
        else  {
            System.out.println("No valid Person");
        }
    }


}
