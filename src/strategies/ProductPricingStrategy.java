package strategies;
import com.main.beans.ProductBean;

public interface ProductPricingStrategy 
{
    double calculatePrice(ProductBean product);
}
