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
import java.util.Collection;
public class Barn {

    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.bulkTank = tank;
    }

    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }
    
    public void takeCareOf(Cow cow){
        try{
            this.milkingRobot.milk(cow);
        }catch(Exception e){
            throw new IllegalStateException("Milking robot hasn't been installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        for(Cow cow:cows){
            takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        return this.bulkTank.toString();
    }
    
}
