/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
public class CivilService implements NationalService {
    int daysLeft;
    
    public CivilService() {
        this.daysLeft = 362;
    }

    
    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        if(this.daysLeft > 0){
            this.daysLeft--;
        }
    }
    
}