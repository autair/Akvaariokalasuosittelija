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

        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Akvaarion koko: ");
        int volume = scanner.nextInt();
        Aquarium a = new Aquarium(volume);
        FishReferee f = new FishReferee(lib.generateFirstFishlist(volume), a);
        f.printCurrentList();
        f.countTopFish((Species)f.getList().get(1));
        
        
       


    }

}
