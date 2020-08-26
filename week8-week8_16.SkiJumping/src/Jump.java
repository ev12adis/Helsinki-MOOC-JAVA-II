/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Jump {

    private List<Integer> scores;
    private int distance;
    private Random random;

    public Jump() {
        this.scores = new ArrayList<Integer>(5);
        this.random = new Random();
        this.distance = this.getDistance();
        this.vote();
    }

    public int getDistance() {
        return this.distance = (random.nextInt(60) + 60);
    }

    public void vote() {
        for (int i = 0; i < 5; i++) {
            scores.add(random.nextInt(10) + 10);
        }

    }

    public int getLength() {
        return this.distance;
    }

    public int getFinalScore() {
        List<Integer> sorted = scores;
        Collections.sort(sorted);
        int finalScore = 0;
        for (int i = 1; i < 4; i++) {
            finalScore += sorted.get(i);
        }
        finalScore += this.distance;
        return finalScore;
    }

    public String getVotes() {
        String votes = "[";
        for (int i = 0; i < 4; i++) {
            votes += this.scores.get(i) + ", ";
        }
        votes += this.scores.get(4) + "]";
        return votes;
    }

    @Override
    public String toString() {
        return "    length: " + this.distance + "\n    judge votes: " + this.getVotes();
    }

}
