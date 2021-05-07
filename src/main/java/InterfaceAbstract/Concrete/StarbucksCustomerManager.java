package InterfaceAbstract;


import InterfaceAbstract.Abstracts.BaseCustomerManager;

public class StarbucksCustomerManager extends BaseCustomerManager {


    private InterfaceAbstract.ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(InterfaceAbstract.ICustomerCheckService customerCheckService){
        this.customerCheckService=customerCheckService;
    }

    @Override
            public void Save(InterfaceAbstract.Customer customer){
        if(customerCheckService.CheckIfRealPerson(customer)){
        super.Save(customer);
    }
        else  {
            System.out.println("No valid Person");
        }
    }


}
