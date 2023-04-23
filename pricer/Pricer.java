package pricer;

import orderer.Order;

import java.util.List;

import menu.MenuItem;

public interface Pricer {
    
    public List<MenuItem> getOrder(Order orderer);

    public double PricingStrategy(List<MenuItem> order);

}
