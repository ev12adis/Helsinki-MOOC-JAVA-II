/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegister {

    private HashMap<RegistrationPlate,String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate,String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.get(plate)!=(null)){
            return false;
        }else{
        this.owners.put(plate, owner);
        return true;
        }
    }
    
    public String get(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            return owners.get(plate);
        }else{
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }else{
            return false;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate key: this.owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for(RegistrationPlate key : this.owners.keySet()){
            if(!owners.contains(get(key))){
                owners.add(get(key));
            }
        }
     
        for(String owner:owners){
            System.out.println(owner);
        }
    }
}
