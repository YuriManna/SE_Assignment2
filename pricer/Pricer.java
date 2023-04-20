package pricer;

import orderer.Orderer;

import java.util.List;

import menu.MenuItem;

public interface Pricer {
    
    public List<MenuItem> getOrder(Orderer orderer);

    public double PricingStrategy(List<MenuItem> order);

}
