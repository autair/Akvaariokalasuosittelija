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
public class FishReferee {

    private Aquarium a;
    private ArrayList<Fish> list;

    public FishReferee(Aquarium a) {
        this.a = a;
        this.list = new ArrayList<>();
        
    }


}
