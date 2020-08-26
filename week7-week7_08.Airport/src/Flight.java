/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */

public class Flight {
    String plane;
    String from;
    String to;

    public Flight(String plane, String from, String to) {
        this.plane = plane;
        this.from = from;
        this.to = to;
    }
    
    public String getPlaneID(){
        return this.plane;
    }

    @Override
    public String toString() {
        return "(" + this.from + "-" + this.to + ")";
    }
    
    
}
