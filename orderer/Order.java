package orderer;

import java.util.List;

import menu.MenuItem;
import pricer.*;

public abstract class Order {

    private String status;
    private double timeStatus;
    private List<MenuItem> currentOrder;
    private Pricer pricer;

    public Order(){

    }
    public void addOrder(List<MenuItem> order){

    }
    /**
     * @return list of ordered <MenuItems>
     */
    public List<MenuItem> getOrder() {

    }
    public String getStatus(){

    }
    public double getTimeStatus(){

    }
    public double getOrderPrice() {
        
    }
}
