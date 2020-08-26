/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class UI {

    Scanner reader;
    List<Jumper> jumpers;

    public UI() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();
    }

    public void start() {
        String input = new String();
        int round = 0;

        System.out.print("Kumpula ski jumping week\n\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.\n");

        while (true) {
            System.out.print("  Participant name: ");
            input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }
            this.jumpers.add(new Jumper(input));
        }

        System.out.print("\nThe tournament begins!\n");

        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            input = reader.nextLine();
            if (!input.equals("jump")) {
                break;
            }
            round++;
            Collections.sort(jumpers);
            System.out.println("\nRound " + round
                    + "\n\nJumping order:");
            for (Jumper jumper : this.jumpers) {
                System.out.println("  " + (jumpers.indexOf(jumper) + 1) + ". " + jumper);
            }

            System.out.print("\nResults of round " + round + "\n");
            for (Jumper jumper : this.jumpers) {
                Jump jump = new Jump();
                jumper.Jump(jump);

                System.out.println("  " + jumper.getName() + "\n" + jump);

            }
        }

        System.out.println("Thanks!\n"
                + "\n"
                + "Tournament results:\n"
                + "Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (Jumper jumper : this.jumpers) {
            System.out.println((jumpers.indexOf(jumper) + 1) + "           " + jumper + "\n            jump lengths: " + jumper.getJumps());
        }

    }
}
