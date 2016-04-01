/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.util.Iterator;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author autair
 */
public class Library {

    private File fishlist;
    private Scanner scanner;
    private ArrayList<Species> list;
    private ArrayList<Species> all;
    private int aqSize;

    public Library() {
        this.list = new ArrayList();
        this.all = new ArrayList();
        this.aqSize = 0;

    }

    public void listOfAllSpecies() {
        this.all = new ArrayList<Species>();

        File fishlist = new File("fishlist.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(fishlist);
        } catch (Exception e) {
            System.out.println("Kirjaston lukeminen epäonnistui. Virhe: " + e.getMessage());
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(";");
            Species s = new Species();
            s.setAqMinSize(Integer.parseInt(parts[5]));
            s.setFloor(parts[4]);
            s.setIsSocial(Boolean.parseBoolean(parts[3]));
            s.setLenght(Integer.parseInt(parts[2]));
            s.setLatin_name(parts[1]);
            s.setName(parts[0]);
            s.setpHmin(Double.parseDouble(parts[6]));
            s.setpHmax(Double.parseDouble(parts[7]));
            s.setTempMin(Integer.parseInt(parts[8]));
            s.setTempMax(Integer.parseInt(parts[9]));

            this.all.add(s);

        }

        scanner.close();

    }

    public ArrayList getCurrentList() {
        return this.list;
    }

    public int getSpeciesCount() {
        return this.list.size();
    }

    public ArrayList generateFirstFishlist(int aqVolume) {
        if (aqVolume <= 0) {
            System.out.println("Akvaarion tilavuus ei voi olla negatiivinen");
            return null;
        }
        File fishlist = new File("fishlist.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(fishlist);
        } catch (Exception e) {
            System.out.println("Kirjaston lukeminen epäonnistui. Virhe: " + e.getMessage());
            return null;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(";");
            Species s = new Species();
            s.setAqMinSize(Integer.parseInt(parts[5]));
            s.setFloor(parts[4]);
            s.setIsSocial(Boolean.parseBoolean(parts[3]));
            s.setLenght(Integer.parseInt(parts[2]));
            s.setLatin_name(parts[1]);
            s.setName(parts[0]);
            s.setpHmin(Double.parseDouble(parts[6]));
            s.setpHmax(Double.parseDouble(parts[7]));
            s.setTempMin(Integer.parseInt(parts[8]));
            s.setTempMax(Integer.parseInt(parts[9]));

            if (s.getaqMinSize() <= aqVolume) {
                this.list.add(s);
            }

        }

        scanner.close();

//        for (Species s : this.list) {
//            System.out.println(s.getName());
//        }
        return this.list;
    }

    public ArrayList upDateFishList(Species s) {
        Iterator<Species> i = this.list.iterator();

        while (i.hasNext()) {
            Species x = i.next();

            if (x.getTempMin() > s.getTempMax()) {
                i.remove();
            }
            if (x.getaqMinSize() > this.aqSize) {
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

    public void printCurrentList() {
        for (Species s : this.list) {
            System.out.println(s.getName());
        }
    }

    public void printAllList() {
        for (Species s : this.all) {
            System.out.println(s.getName());
        }
    }

}
