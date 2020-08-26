/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author Evan
 */
import java.io.File;
import java.util.Scanner;

public class Analysis {

    private Scanner reader;
    private File file;
    private int lineCount;
    private int charCount;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception{
        analyzeFile();
        return this.lineCount;
    }

    public int characters() throws Exception{
        analyzeFile();
        return this.charCount;

    }

    private void analyzeFile() throws Exception {
        this.reader = new Scanner(this.file);
        this.lineCount = 0;
        this.charCount = 0;
        String line;
        while (this.reader.hasNextLine()) {
            lineCount++;
            charCount++;
            line = reader.nextLine();
            charCount += line.length();
        }
        reader.close();

    }
    
}
