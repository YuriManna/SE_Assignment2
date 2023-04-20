package menu;

import java.util.List;

public class Dish extends MenuItem {

    public List<Ingredient> ingredients;
    public String type; // side dish, main dish, starter
   
    //this makes a dish object and converts a string[] into and List<Ingredient> using getQuality()
    public Dish(String name, double price, String description ,String[] ingredients, String type) {

    }

    public List<Ingredient> getIngredients(){

    }

    public void setIngredients(List<Ingredient> ingredients){

    }

    public String getType() {

    }

    public void setType(String type) {

    }
}
