/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{

    private int maximumCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(getVolume() + thing.getVolume() > this.maximumCapacity){
            return false;
        }
        this.things.add(thing);
        return true;
    }
    
    @Override
    public int getVolume() {
        int weight = 0;
        for(Thing thing : this.things){
            weight += thing.getVolume();
        }
        return weight;
    }
    
    
    
}
