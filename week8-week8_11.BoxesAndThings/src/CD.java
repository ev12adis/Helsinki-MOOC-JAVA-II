/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
public class CD implements ToBeStored{
    String artist;
    String title;
    int year;
    final static double WEIGHT = 0.1;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    
    public double weight() {
        return WEIGHT;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString() {
        return getArtist() + ": " + getTitle() + " (" + getYear() + ")" ;
    }
    
   
}
