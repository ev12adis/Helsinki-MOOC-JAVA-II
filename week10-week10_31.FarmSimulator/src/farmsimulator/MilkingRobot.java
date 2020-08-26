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
public class MilkingRobot {
    
    private BulkTank bulkTank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank bulktank) {
        this.bulkTank = bulktank;
    }
    
    public void milk(Milkable milkable){
        try{
            this.bulkTank.addToTank(milkable.milk());
        }catch(Exception e){
            throw new IllegalStateException("No tank has been fixed");
        }
    }
}
