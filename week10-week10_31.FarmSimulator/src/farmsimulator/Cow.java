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
import java.util.Random;
public class Cow implements Milkable, Alive{

    private String name;
    
    private int capacity;            //udder capacity
    private double amount;              //amount stored in udders
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return name;
    }
     
    public  double getCapacity(){       //return udder capacity
        return this.capacity;
    }
    
    public double getAmount(){
        return this.amount;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.capacity);
    }

    @Override
    public double milk() {
        double milked = this.amount;
        this.amount = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        double produced = (7 + new Random().nextInt(13));
        this.amount += (produced/10);
        if(this.capacity < this.amount){
            this.amount = this.capacity;
        }
    }
}
