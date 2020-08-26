/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;

public class Farm implements Alive{

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }

    public String getOwner() {
        return owner;
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : cows){
            cow.liveHour();
        }
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public String toString() {
        String returnString = "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.toString();
        if(this.cows.size()==0){
            returnString += "\nNo Cows.\n" + getOwner() + " is a tough guy!";
        }else{
            returnString += "\nAnimals:";
        }
        for(Cow cow: this.cows){
            returnString +="\n        " + cow.toString();
        }
        return returnString;
    }
    
    
    
}
