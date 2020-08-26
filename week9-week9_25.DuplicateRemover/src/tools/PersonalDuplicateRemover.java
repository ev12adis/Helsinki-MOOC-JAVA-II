/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Evan
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> charStrings;
    private int duplicateCount;

    public PersonalDuplicateRemover() {
        this.charStrings = new HashSet<String>();
        this.duplicateCount = 0;
    }
    
    
    @Override
    public void add(String characterString) {
        if(this.charStrings.contains(characterString)){
            duplicateCount++;
            return;
        }
        this.charStrings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return charStrings;
    }

    @Override
    public void empty() {
        this.charStrings.clear();
        this.duplicateCount = 0;
    }
    
}
