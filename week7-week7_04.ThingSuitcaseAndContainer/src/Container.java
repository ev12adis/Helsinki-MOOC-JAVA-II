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

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
         if(totalWeight()+suitcase.totalWeight()<=maxWeight){
            suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int sumWeight = 0;
        for(Suitcase suitcase: suitcases){
            sumWeight += suitcase.totalWeight();
        }
        return sumWeight;
    }
    
    public String toString(){
        return "" + suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase:suitcases){
            suitcase.printThings();
        }
    }

}
