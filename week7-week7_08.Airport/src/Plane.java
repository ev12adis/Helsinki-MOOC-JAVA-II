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

public class Plane {
    private String ID;
    private int capacity;

    
    public Plane(String id, int capacity) {
        this.ID = id;
        this.capacity = capacity;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + " ppl)";
    }
        
}
