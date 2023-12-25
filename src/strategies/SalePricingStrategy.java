package strategies;

import com.main.beans.ProductBean;

public class SalePricingStrategy implements ProductPricingStrategy
{
	    private double discountPercentage = 10;

	    @Override
	    public double calculatePrice(ProductBean product)
	    {
	        double discountedPrice = product.getProdPrice() * (1 - (discountPercentage / 100));
	        return discountedPrice;
	    }
}
