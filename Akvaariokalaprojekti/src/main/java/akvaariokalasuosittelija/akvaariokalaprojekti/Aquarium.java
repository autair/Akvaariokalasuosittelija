/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.util.ArrayList;

/**
 *
 * @author autair
 */
public class Aquarium {

    private int volume;
    private float pH;
    public ArrayList<Fish> fishListTop;
    public ArrayList<Fish> fishListMid;
    public ArrayList<Fish> fishListBottom;
    private boolean topFull;
    private boolean midFull;
    private boolean bottomFull;

    public Aquarium(int volume) {
        this.volume = volume;
        this.fishListMid = new ArrayList<>();
        this.fishListTop = new ArrayList<>();
        this.fishListBottom = new ArrayList<>();
        this.bottomFull = false;
        this.topFull = false;
        this.midFull = false;
    }


    public int getVolume() {
        return this.volume;
    }

    public boolean isTopFull() {
        return this.topFull;
    }
    public boolean isMidFull() {
        return this.midFull;
    }
    public boolean isBottomFull() {
        return this.bottomFull;
    }
    public void setTopStatus(boolean value) {
        this.topFull = value;
    }
    public void setMidStatus(boolean value) {
        this.midFull = value;
    }
    public void setBottomStatus(boolean value) {
        this.bottomFull = value;
    }
   
   
}
