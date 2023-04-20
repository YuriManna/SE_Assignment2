import menu.*;
import orderer.*;
import delivery.*;
import pricer.*;

public class Restaurant {

    private Menu menu;
    private Orderer orderer;
    private Delivery delivery;
    private Pricer pricer;

    public Restaurant(){
        this.menu = new Menu();
        String[] pastaPestoIngr = {"pasta","pesto","olive oil"};
        menu.AddDishes("Pasta al pesto", 12, pastaPestoIngr , "Main Dish");

        menu.AddDrinks("Coca Cola", 2.5, "fizzy drink");

        menu.AddDesserts("Tiramisù", 5, "coffee flavour dessert");
    }
}