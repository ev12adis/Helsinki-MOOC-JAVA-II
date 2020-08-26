/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author Evan
 */
import moving.domain.Box;
import moving.domain.Thing;
import java.util.List;
import java.util.ArrayList;

public class Packer {

    int boxesVolume;
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxes= new ArrayList<Box>();
        int i=0;
        for(Thing thing: things){
            boxes.add(new Box(this.boxesVolume));
            if((boxes.get(i).addThing(thing))==true){}
            else{i++;
            boxes.get(i).addThing(thing);}
            
            
        }
        return boxes;
        
    }
    
}
