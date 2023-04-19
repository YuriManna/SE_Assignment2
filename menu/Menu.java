package menu;

import java.util.List;

public class Menu {

    public List <MenuItem> drinks;
    public List <MenuItem> desserts;
    public List <Dish> dishes;

    public List<List<Dish>> menuList;
    
    public Menu(){
        menuList.add(0, dishes);
        menuList.add(1,drinks);
    }
}
