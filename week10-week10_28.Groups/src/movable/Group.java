/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;
public class Group implements Movable{

    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    @Override
    public String toString() {
        String groupString = "";
        for(Movable organism: this.group){
            groupString += organism.toString() + "\n";
        }
        return groupString;
    }
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism: this.group){
            organism.move(dx, dy);
        }
    }
    
}
