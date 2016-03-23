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
public class Fish extends Species {
    private Aquarium aquarium;
    private int amount;
    
    public Fish(Aquarium a, int amount, String name, String latin_name, boolean isSocial, int lenght, String floor, int aqMinSize, double pHmin, double pHmax) {
        super(name, latin_name, lenght, isSocial, floor, aqMinSize, pHmin, pHmax);
        this.aquarium = a;
        this.amount = amount;
    }
    public Aquarium a() {
        return this.aquarium;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return this.amount;
    }
    
    
}
