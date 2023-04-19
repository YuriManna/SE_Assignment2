package menu;

public abstract class MenuItem {

    public String name;
    public double price;
    public String type;

    public MenuItem(String name, double price){

       this.name = name;
       this.price = price;
    }

    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

    public double getPrice(){

        return price;
    }

    public void setPrice(double price){

        this.price = price;
    }

    public String toString(){
        return name;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

   


    
}
