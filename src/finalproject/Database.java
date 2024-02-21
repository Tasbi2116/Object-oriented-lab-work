/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Lenovo
 */
import java.util.*;

public class Database {
    private ArrayList items;

   public Database()  {
        items = new ArrayList();
    }

   public void addItem(Item theItem)  {
        items.add(theItem);
    }
   @Override
   public String toString() {
   String result = "";
        for(Iterator iter = items.iterator(); iter.hasNext(); )  {
            Item item = (Item)iter.next();
            result += item.toString();
        }
    return result;
    }
}
