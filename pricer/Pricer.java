package pricer;

import orderer.Order;

import java.util.List;

import menu.MenuItem;

public interface Pricer {
    
    //gets the list of dishes from the order to be used by pricingStrategy()
    public List<MenuItem> getOrder(Order orderer);

    //computes prices following a pricing strategy (to be implemented with client strategy)
    public double pricingStrategy(List<MenuItem> order);

}
