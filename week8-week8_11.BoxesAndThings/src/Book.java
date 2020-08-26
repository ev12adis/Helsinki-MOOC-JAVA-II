/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
public class Book implements ToBeStored {
    String writer;
    String name;
    double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getWriter() {
        return writer;
    }
 
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return getWriter() + ": " + getName();
    }
    
    
    
    
}
