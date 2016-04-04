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
public class Fish {
    private Aquarium aquarium;
    private int amount;
    private Species s;
    private int lengthOfAll;
    
    public Fish(Aquarium a, Species s) {
        this.s = s;
        this.aquarium = a;
        this.amount = amount;
        this.lengthOfAll = 0;
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
    public Species getSpecies() {
        return this.s;
    }
    public void setLengthOfAll() {
        this.lengthOfAll = this.s.getLenght()*this.amount;
    }
    public int getLengthOfAll() {
        return this.lengthOfAll;
    }
    
    
}
