/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author autair
 */
public class Library {

    private File fishlist;
    private Scanner scanner;

    public Library() {
//        
    }
    
   

    public void printFishlist() {
        
        File fishlist = new File("fishlist.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(fishlist);
        } catch (Exception e) {
            System.out.println("Kirjaston lukeminen epäonnistui. Virhe: " + e.getMessage());
            return; // poistutaan metodista
        }
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            System.out.println(line);
        }

        scanner.close();
    }

    
}
