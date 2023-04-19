package menu;

public class Dish extends MenuItem {

    public Ingredient[] ingredients;
   
    public Dish(String name, double price, Ingredient[] ingredients, String type) {

       super(name, price);

       this.ingredients = ingredients;

   
    }

    public Ingredient[] getIngredients(){

        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients){

        this.ingredients = ingredients;
    }

    

}
