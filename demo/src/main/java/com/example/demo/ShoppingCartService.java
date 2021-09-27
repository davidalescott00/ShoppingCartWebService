package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService {
    public static List<CartItem> surrogateDB = new ArrayList<CartItem>();

    public CartItem getItemById(int id) {
        for (CartItem ci : surrogateDB){
            if (ci.getID() ==id){
                return ci;
            }
        }
        return null;
    }
      
    public List<CartItem> getAllItems() {
       return surrogateDB;
    }

    public void addItem(CartItem item){
        surrogateDB.add(item);
    }

    public void updateItem(CartItem item){
        for (CartItem ci : surrogateDB){
            if (ci.getID() ==item.getID()){
                surrogateDB.remove(ci);
            }
        }
        surrogateDB.add(item);
    }

    public void removeItem(CartItem item){
        for (CartItem ci : surrogateDB){
            if (ci.getID() ==item.getID()){
                surrogateDB.remove(ci);
            }
        }
    }

}
