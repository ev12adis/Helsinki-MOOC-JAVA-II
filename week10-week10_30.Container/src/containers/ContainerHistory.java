/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return "" + this.history;
    }

    public double maxValue() {
        double max = 0;
        for (Double val : this.history) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        for (Double val : this.history) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public double average() {
        double avg = 0;
        for(Double val: this.history){
            avg +=val;
        }
        return avg/history.size();
    }
    
    public double greatestFluctuation(){
        if(history.size()<1){
            return 0;
        }
        double maxFluct = 0;
        
        for(int i=0;i<this.history.size()-1;i++){
            double temp = Math.abs(history.get(i)-history.get(i+1));
            if(temp>maxFluct){
                maxFluct = temp;
            }
        }
        return maxFluct;
    }
    
    public double variance(){
        if(history.size()<1){
            return 0;
        }
        double var = 0;
        for(Double val:this.history){
            var += Math.pow(val-this.average(), 2);
        }
        
        return var/(this.history.size()-1);
    }

}
