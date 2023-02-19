package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
  private   CustomerCheckService customerCheckService;

  public CustomerManager(CustomerCheckService customerCheckService) {
    this.customerCheckService = customerCheckService;
  }



  @Override
    public void add(Customer customer) {
      if (customerCheckService.checkIfPerson(customer)){
        System.out.println(customer.getFirstName()+"isimli oyuncu kaydedildi");
      }
        else {
        System.out.println("kayıt başarısız");
      }
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }
}
