/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author autair
 */
public class FishReferee {

    private ArrayList<Species> list;
    private Aquarium a;

    public FishReferee(ArrayList list, Aquarium a) {
        this.list = list;
        this.a = a;
    }

    public int countHowManyFishCanBeTaken(Species spe) {
        
        if (spe.getFloor().equals("top")) {
            if (a.isTopFull() == false) {
                
            }
            return 555;
        }

        return 345;
    }

    public int getSpeciesCount() {
        return this.list.size();
    }
    public ArrayList getList() {
        return this.list;
    }
    
    public int countTopFish(Species s) {
        int lengthOfFishAlreadyInAquarium = 0;
        for (Fish f : a.fishListTop) {
            lengthOfFishAlreadyInAquarium = lengthOfFishAlreadyInAquarium + f.getLengthOfAll();
        }
        int count = Math.round(((a.getVolume()/3) - lengthOfFishAlreadyInAquarium)/s.getLenght()); 
        System.out.println(s.getName() + " määrä " + count);
        return count; //määrä on väärä
    }

    public ArrayList upDateFishList(Species s) {
        Iterator<Species> i = this.list.iterator();

        while (i.hasNext()) {
            Species x = i.next();

            if (x.getTempMin() > s.getTempMax()) {
                i.remove();
            }
            if (x.getaqMinSize() > s.getaqMinSize()) {
                i.remove();
            }
            if (x.getMinpH() > s.getMaxpH()) {
                i.remove();
            }
            if (x.getMaxpH() < s.getMinpH()) {
                i.remove();
            }
            if (x.getTempMax() < s.getTempMin()) {
                i.remove();
            }

        }

        return this.list;

    }

    public ArrayList findSpecies(String name) {

        try {
            for (Species x : this.list) {
                if (x.getName().equals(name)) {
                    return (this.upDateFishList(x));
                }
            }
        } catch (Exception NullPointerException) {
            System.out.println("Lista on tyhjä.");
        }
        return null;
    }

    public void printCurrentList() {
        try {

            for (Species s : this.list) {
                System.out.println(s.getName());
            }

        } catch (Exception NullPointerException) {
            System.out.println("Lista on tyhjä.");
        }

    }

}
