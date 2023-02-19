package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfPerson(Customer customer) {
        if (customer.getFirstName()=="Mervan"&& customer.getLastName()=="Yaylacı"&&customer.getTcNo()=="12345678910"&&
                customer.getDateOfBirth()==2001){
            return true;
        }
        else {
            return false;
        }
    }
}
