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

public class Jumper implements Comparable<Jumper> {

    private List<Jump> jumps;
    private String name;

    public Jumper(String name) {
        this.name = name;
        jumps = new ArrayList<Jump>();
    }

    public Integer getTotalPoints() {
        int total = 0;
        for (Jump jump : this.jumps) {
            total += jump.getFinalScore();
        }
        return total;
    }

    public void Jump(Jump jump) {
        this.jumps.add(jump);
    }

    public String getName() {
        return this.name;
    }

    public String getJumps() {
        String jumpLengths = "";
        int i = 0;
        Jump jump = this.jumps.get(i);
        while (i < this.jumps.size() - 1) {
            jump = this.jumps.get(i);
            jumpLengths += jump.getLength() + " m, ";
            i++;
        }
        jump = this.jumps.get(i);
        jumpLengths += jump.getLength() + " m";
        return jumpLengths;
    }

    @Override
    public String toString() {
        return "" + this.name + " (" + getTotalPoints() + " points)";
    }

    @Override
    public int compareTo(Jumper arg0) {
        return this.getTotalPoints() - arg0.getTotalPoints();
    }

}
