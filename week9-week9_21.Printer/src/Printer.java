/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.io.File;
import java.util.Scanner;

public class Printer {

    private final File file;
    private Scanner reader;

    public Printer(String filename) throws Exception {
        this.file = new File(filename);
        this.reader = new Scanner(this.file);
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(this.file);
        while (this.reader.hasNextLine()) {
            String nextL = reader.nextLine();
            if (nextL.contains(word)) {
                System.out.println(nextL);
            }
        }
        reader.close();
    }

}
