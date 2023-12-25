package strategies;

import com.main.beans.ProductBean;

public class RegularPricingStrategy implements ProductPricingStrategy {
    @Override
    public double calculatePrice(ProductBean product)
    {
    	return product.getProdPrice();
    }
}