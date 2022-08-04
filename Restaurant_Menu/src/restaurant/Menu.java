
package restaurant;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items){
        this.items = items;
        this.lastUpdated = new Date();

    }
    public void add(MenuItem item){
        this.items.add(item);
    }


    public Date getLastUpdated(){
        return lastUpdated;
    }

    public void simpleRemove(int index){
        this.items.remove(index);

    }

    public void remove(){
        Scanner input = new Scanner(System.in);
        System.out.println( "Select the number corresponding to the item you want to remove: ");
        this.showAll();
        int indexToRemove = input.nextInt();
        input.close();

        this.items.remove(indexToRemove);
    }

    public void setLastUpdated(Date lastUpdated){
        this.lastUpdated = lastUpdated;
    }

   /* public  void addItem(){
        Scanner input = new Scanner(System.in);
        System.out.println(" What is the new item's name?");
        String itemName = input.next();
        System.out.println(" What is the new item's description?");
        String itemDescription = input.next();
        System.out.println(" What is the new item's description?");
        String itemCategory = input.next();
        System.out.println(" What is the new item's price?");
        double itemPrice = input.nextDouble();
        input.close();

        MenuItem x = new MenuItem(itemName, itemDescription, itemCategory, itemPrice );



    }*/

    public void showLastUpdated(){
        System.out.println(" The menu was last up dated on :"+ this.getLastUpdated());
    }

    public void simpleShowItem(int index){
        MenuItem myItem = this.items.get(index);
        System.out.println(myItem.getName()+ ": "+ myItem.getPrice());
    }

    public void showItem(){
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Select a number from 1 to "+ this.items.size()+ " the item you want to check: "));
        this.showAll();
        int itemToShow = input.nextInt() -1;
        input.close();
        this.simpleShowItem(itemToShow);

    }

    public void showAll(){
        for (int i = 0; i< this.items.size(); i++){
            MenuItem theItem = this.items.get(i);
            System.out.println(String.format("%s - %s: %s", i+ 1, theItem.getName(), theItem.getPrice()));
        }
    }
}