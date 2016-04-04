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
    private ArrayList<Species> toplist;
    private ArrayList<Species> midlist;
    private ArrayList<Species> bottomlist;
    private ArrayList<Species> selectedSpecies;
    private Aquarium a;
    private int maxTopSpeciesCount;
    private int maxMidSpeciesCount;
    private int maxBottomSpeciesCount;

    public FishReferee(ArrayList list, Aquarium a) {
        this.list = list;
        this.toplist = new ArrayList();
        this.midlist = new ArrayList();
        this.bottomlist = new ArrayList();
        this.selectedSpecies = new ArrayList();
        this.a = a;
    }

    public void update() {

        this.makeBottomFishList();
        this.makeMidFishList();
        this.makeTopFishList();
    }

    public void printMidList() {
        for (Species s : this.midlist) {
            System.out.println(s.getName());
        }
    }

    public void setSpeciesCount() {
        if (this.a.getVolume() < 100) {
            this.maxBottomSpeciesCount = 1;
            this.maxMidSpeciesCount = 1;
            this.maxTopSpeciesCount = 1;
        } else {
            this.maxBottomSpeciesCount = 2;
            this.maxMidSpeciesCount = 2;
            this.maxTopSpeciesCount = 2;
        }
    }

    public int getSpeciesCount() {
        return this.list.size();
    }

    public ArrayList getMidList() {
        return this.midlist;
    }
     public ArrayList getTopList() {
        return this.toplist;
    }

    public ArrayList getAllList() {
        return this.list;
    }

    public void makeMidFishList() {
        for (Species x : this.list) {
            if (x.getFloor().equals("mid")) {
                this.midlist.add(x);
            }
        }
    }

    public void makeTopFishList() {
        for (Species x : this.list) {
            if (x.getFloor().equals("top")) {
                this.toplist.add(x);
            }
        }
    }

    public void makeBottomFishList() {
        for (Species x : this.list) {
            if (x.getFloor().equals("bottom")) {
                this.bottomlist.add(x);
            }
        }
    }

//    public int countTopFish(Species s) {
//        int lengthOfFishAlreadyInAquarium = 0;
//        for (Fish f : a.fishListTop) {
//            lengthOfFishAlreadyInAquarium = lengthOfFishAlreadyInAquarium + f.getLengthOfAll();
//        }
//        int count = Math.round(((a.getVolume() / 3)) / s.getLenght());
//        if (s.isSocial == true && count < 7) {
//            return 0;
//        }
//        if (s.isSocial == false && count >= 2) {
//            System.out.println(s.getName() + " määrä 2");
//            return 2;
//        } else {
//            System.out.println(s.getName() + " määrä " + count);
//            return count;
//        }
//    }
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
        this.selectedSpecies.add(s);
        this.list.remove(s);

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
