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
public class Dricka extends Varor implements Metoder{
    
    // Skapa konstruktor för Dricka-produkter
    public Dricka(String namn, String beskrivning, int kostnad) {
        super(namn, beskrivning, kostnad);
    }
    
    

    @Override
    public void Description() {
        
    }

    @Override
    public void Buy() {
        
    }

    @Override
    public void Use() {
        
    }
    
}
