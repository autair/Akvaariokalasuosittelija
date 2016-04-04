/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author autair
 */
public class UI {

    public UI() {
    }

    public void start() {

        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Akvaarion koko: ");
        int volume = scanner.nextInt();
        Aquarium a = new Aquarium(volume);
        FishReferee f = new FishReferee(lib.generateFirstFishlist(volume), a);
        f.update();
        f.setSpeciesCount();
        
        
//        f.printMidList();
//        System.out.println("Valitse listalta keskiveden kalalaji: ");
//        f.upDateFishList((Species)f.getMidList().get(2));
//        f.update();
//        f.printMidList();
        
       


    }

}
