/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch.domain;


import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Evan
 */

public class Contact implements Comparable<Contact>{
    
    private String name;
    private Set<String> numbers;
    private Set<String> addresses;

    public Contact(String name){
        this.numbers = new HashSet<String>();
        this.addresses = new HashSet<String>();
        this.name = name;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public String getName() {
        return this.name;
    }
    
    public void addNumber(String number){
        this.numbers.add(number);
    }
    
    public void addAddress(String address){
        this.addresses.add(address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Contact compared = (Contact) obj;


        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String string = "  address";
        if(this.addresses.isEmpty()){
            string += " unknown\n";
        }else{
            string +=":";
            for(String address: this.addresses){
                string +=" " + address + "\n";
            }
        }
        
        string += "  phone";
        if(this.numbers.isEmpty()){
            string += " number not found";
        } else{
            string += " numbers:";
            for(String number: this.numbers){
                string += "\n   " + number;
            }
        }
        return string;
    }
    
    @Override
    public int compareTo(Contact arg0) {
        return this.name.compareToIgnoreCase(arg0.getName());
    }
    
    
    
}
