/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;
import java.util.ArrayList;
/**
 *
 * @author autair
 */
public class Library {
    private ArrayList<Species> list;
    
    public Library() {
        this.list = new ArrayList<>();
        Species danio = new Species("Seeprakala", "Danio Rerio", 5, true, "mid", 70, 6.5, 7.0);
        this.list.add(danio);
    }
    public boolean isSpeciesInLibrary(String name) {
        for (Species s : this.list) {
            if (s.getName().equals(name)) {
                return true;
            }
            
        }
        return false;
    }
    public Species returnSpecies(String name) {
        for (Species s : this.list) {
            if (s.getName().equals(name)) {
                return s;
            }
            
        }
        
        return null;
    }
    public void printFish(int volume) { //tassa taytyy tarkistaa fishrefereen jo listalla olevat kalat ja katsoa sopiiko pH!
        for (Species s : this.list) {
            if (s.getaqMinSize() < volume)
            System.out.println(s.getName() + "\n");
        }
    }
    
}
