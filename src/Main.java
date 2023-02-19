import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class Main {
    public static void main(String[] args) {
        Customer mustafa=new Customer(1,"Mervan","Yaylacı","12345678910",2001);
        Product product=new Product(1,"Valorant",100);
        Campaign campaign=new Campaign(1,"2 al 1 öde",50);
        CustomerManager customerManager=new CustomerManager(new CustomerCheckManager());
        customerManager.add(mustafa);

        SaleManager saleManager= new SaleManager();
        saleManager.sale(product,mustafa,campaign);
    }
}