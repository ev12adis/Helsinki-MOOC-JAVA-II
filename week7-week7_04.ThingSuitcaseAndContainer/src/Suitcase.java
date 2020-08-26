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

public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLim) {
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLim;
    }
    
    public void addThing(Thing thing){
        if(totalWeight()+thing.getWeight()<=weightLimit){
            this.things.add(thing);
        }
    }

    public String toString(){
        if(things.size()>1){
            return "" + things.size() + " things (" + totalWeight() + " kg)";
        }
        else if(things.size()==0){
            return "empty (0 kg)";
        }else{
            return "" + things.size() + " thing (" + totalWeight() + " kg)";
        }
    }
    
    public void printThings(){
        for(Thing thing:things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        int sumWeight = 0;
        for(Thing thing: things){
            sumWeight += thing.getWeight();
        }
        return sumWeight;
    }
    
    public Thing heaviestThing(){
        if(this.things.size()>0){
            Thing heavy = this.things.get(0);
             for(Thing thing:things){
                 if(thing.getWeight()>heavy.getWeight()){
                    heavy = thing;
                }
            }
            return heavy;
        }
        return null;
    }

}
