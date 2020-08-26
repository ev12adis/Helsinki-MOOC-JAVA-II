/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card card: this.hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand arg) {
        int hand1Total = 0;
        int hand2Total = 0;
        for(Card card: this.hand){
            hand1Total += card.getValue();
        }
        for(Card card: arg.hand){
            hand2Total += card.getValue();
        }
        
        return hand1Total - hand2Total;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
}
