/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personliginlämningsuppgift;

/**
 *
 * @author schum
 */

abstract public class Varor {
    
    // Attribut för de olika varorna
    
    String namn;
    String beskrivning;
    int kostnad;
    
    // Konstruktor för att skapa instanserna/objekten
    
    public Varor (String namn, String beskrivning, int kostnad){
        this.namn = namn;
        this.beskrivning = beskrivning;
        this.kostnad = kostnad;
    }
    
    
}
