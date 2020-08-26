/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.Map;
import java.util.HashMap;
public class ShoppingBasket {

    private Map<String, Purchase> purchases;
    public ShoppingBasket() {
        this.purchases = new HashMap<String,Purchase>();
    }

    public void add(String product, int price){
        if(!this.purchases.containsKey(product)){
            this.purchases.put(product, new Purchase(product,1,price));
        }else{
            this.purchases.get(product).increaseAmount();
        }
    }
    
    public int price(){
        int total = 0;
        for(String product:this.purchases.keySet()){
            total += this.purchases.get(product).price();
        }
        
        return total;
    }
    
    public void print(){
        for(Purchase purchase:this.purchases.values()){
            System.out.println(purchase);
        }
    }
}
