package org.launchcode;
import org.launchcode.Menu;
import org.launchcode.MenuItem;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Statrup");
       MenuItem item1 = new MenuItem(20, "cheesecake", "dessert", true);
       MenuItem item2 = new MenuItem(40, "steak", "main course", false);
       MenuItem item3 = new MenuItem(30, "calamari", "appetizer", false);

ArrayList<MenuItem> items = new ArrayList();
items.add(item1);
items.add(item2);
items.add(item3);
        //Menu  m1 = new Menu();


    }
}
