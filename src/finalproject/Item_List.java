
package finalproject;


import java.util.*;
import java.io.*;

public class Item_List implements Serializable{
    ArrayList<Item> iList;

    public Item_List() {
        this.iList = new ArrayList();
    }
    public void addItem(Item i){
            iList.add(i);
    }
    public void deleteItem(int index){
     iList.remove(index);
    }
    public void updateItem(int index, Item i){
     iList.set(index,i);
    }
    
    public Item get(int index){
     return iList.get(index);
    }
    public boolean Contains(Item i){
     return iList.contains(i);
    }
    public int num_Items(){
     return iList.size();
    }
    
    public void Sort(){
        Collections.sort(iList);
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (Item i : iList) {
            sb.append(i);
        }
      return sb.toString();
    }

    public ArrayList<Item> getiList() {
        return iList;
    }
    public boolean isEmpty() {
        return iList.isEmpty();
    }
}
