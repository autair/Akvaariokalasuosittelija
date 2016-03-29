/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;
import java.util.Scanner;
/**
 *
 * @author autair
 */
public class UI {
    
    public UI() {
    }
    
    public void start() {
        
        
        //Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Akvaarion koko: ");
        int volume = scanner.nextInt();
        Aquarium a = new Aquarium(volume);
        FishReferee f = new FishReferee(a);
        System.out.println("Valitse listalta kala, jonka ehdottomasti haluat akvaarioosi. Kirjoita se tekstikenttään.");
        
//        lib.printFish(volume);
//        String seepra = scanner.nextLine();
//        if (lib.isSpeciesInLibrary(seepra) == true) {
//            Species x = lib.returnSpecies(seepra);
//            
//        }
    }
    
}
