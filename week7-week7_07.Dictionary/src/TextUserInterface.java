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

public class TextUserInterface {

    Scanner reader = new Scanner(System.in);
    private final Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quits the text user interface");
        while (true) {
            System.out.print("\nStatement: ");

            String input = reader.nextLine();
            input = stringCleaner(input);

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;

            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else {
                System.out.println("UnKnown statement\n");
            }
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public void add() {
        System.out.print("Inf Finnish: ");
        String inFin = reader.nextLine();
        System.out.print("Translation: ");
        String inEng = reader.nextLine();
        this.dictionary.add(inFin, inEng);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String key = reader.nextLine();
        String value = this.dictionary.translate(key);
        System.out.println("Translation: " + value);
    }

}
