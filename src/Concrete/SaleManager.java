package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class SaleManager implements SaleService {

    @Override
    public void sale(Product product, Customer customer, Campaign campaign) {
        System.out.println(product.getProductName()+" isimli ürün "+customer.getFirstName()+" isimli oyuncuya "+
                campaign.getCampaignName()+" kapmanyası ile %"+campaign.getDiscountRate()+" indirim oranı ile satılmıştır");
    }
}
