package com.main.service;
import com.main.service.impl.*;

public class ServiceFactory {

    public OrderService getOrderService() {
        return new OrderServiceImpl();
    }

    public UserService getUserService() {
         return new UserServiceImpl();
    }

    public ProductService getProductService() {
         return new ProductServiceImpl();
    }
    
    public CartService getCartService() {
        return new CartServiceImpl();
   }
    
    public DemandService getDemandService() {
        return new DemandServiceImpl();
   }
    
    public TransService getTransService() {
        return new TransServiceImpl();
   }
}
