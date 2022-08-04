package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MyRestaurant {
    public static void main(String[] args){
        ArrayList<MenuItem> myBucket = new ArrayList<>();

        MenuItem  baconBrusselSprout = new MenuItem(" Bacon wrapped Brussels Sprouts"," They are wrapped in bacon","Appetizer", 15.22);
        MenuItem tresLeches = new MenuItem("tresLeches", " Dominican cake made with 3 differrents milks", "Dessert", 12.50);
        MenuItem Burger = new MenuItem("King Burger"," Its contains the finest beef , doble cheese", "Entree", 25.5);

        myBucket.add(baconBrusselSprout);
        myBucket.add(tresLeches);
        myBucket.add(Burger);


        Menu myMenu = new Menu(myBucket);
        myMenu.showItem();

        ArrayList<MenuItem> myItems = new ArrayList<>()  ;
    }
}
