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
import java.util.Random;
public class Thermometer implements Sensor{

    private Random random;
    private Boolean power;

    public Thermometer() {
        this.random = new Random();
        this.power = false;
    }
    
    
    @Override
    public boolean isOn() {
        return this.power;
    }

    @Override
    public void on() {
        this.power = true;
    }

    @Override
    public void off() {
        this.power = false;
    }

    @Override
    public int measure() {
        if(!this.isOn()){
            throw new IllegalStateException();
        }else{
        return random.nextInt(61)-30;
        }
    }
    
}
