/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.ArrayList;
public class Box implements ToBeStored {
    
    private ArrayList<ToBeStored> things;
    private final double maxWeight;
    public Box(double max){
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = max;
    }

    public double weight() {
        double currentWeight = 0;
        for(ToBeStored thing: this.things){
           currentWeight += thing.weight();
        }
        return currentWeight;
    }
    
    public void add(ToBeStored thing){
        if (weight()+ thing.weight()<= this.maxWeight){
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + this.weight() + " kg";
    }
    
    
    
    
    
}
