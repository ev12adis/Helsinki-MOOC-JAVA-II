/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;
public class AverageSensor implements Sensor{

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor s:this.sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s:this.sensors){
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s:this.sensors){
            s.off();
        }
    }

    @Override
    public int measure() {
        if((!this.isOn())||this.sensors.size()==0){
            throw new IllegalStateException();
        }
        
        int avg = 0;
        
        for(Sensor s:this.sensors){
            avg += s.measure();
        }
        avg/=this.sensors.size();
        this.readings.add(avg);
        return avg;
    }
    
}
