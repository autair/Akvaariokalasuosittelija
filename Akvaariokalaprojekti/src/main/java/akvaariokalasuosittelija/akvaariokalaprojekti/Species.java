/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

/**
 *
 * @author autair
 */
public class Species {
    private String name;
    private String latin_name;
    private int lenght;
    public boolean isSocial;
    private String floor;
    private int aqMinSize;
    private double pHmin;
    private double pHmax;
    
    public Species(String name, String latin_name, int lenght, boolean isSocial, String floor, int aqMinSize, double pHmin, double pHmax) {
        this.name = "seeprakala";
        this.latin_name = "Danio rerio";
        this.lenght = 5;
        this.isSocial = true;
        this.floor = "mid";
        this.aqMinSize = 70;
        this.pHmin = 6.5;
        this.pHmax = 7.0;
        
    }
    public String getName() {
        return this.name;
    }
    public String getLatinName() {
        return this.latin_name;
    }
    public int getLenght() {
        return this.lenght;
    }
    public boolean getSocialStatus() {
        return this.isSocial;
    }
    public String getFloor() {
        return this.floor;
    }
    public int getaqMinSize() {
        return this.aqMinSize;
    }
    public double getMinpH() {
        return this.pHmin;
    }
    public double getMaxpH() {
        return this.pHmax;
    }
}
