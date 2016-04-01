/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akvaariokalasuosittelija.akvaariokalaprojekti;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author autair
 */
public class LibraryTest {
    
    Library l;
    Species notPossible;
    
    @Before
    public void setUp() {
        l = new Library();
        notPossible = new Species("notReal", "latinnotReal", 5, true, "mid", 60, 7.5, 8.0, 15, 30);
    }
    
    @Test
    public void fishListIsEmptyIfVolumeSmallerThanZero() {
        l.generateFirstFishlist(-12);
        assertEquals(true, l.getCurrentList().isEmpty());
    }
    
    @Test
    public void fishListIsEmptyIfVolumeTooSmall() {
        l.generateFirstFishlist(10);
        assertEquals(true, l.getCurrentList().isEmpty());
    }
    
    @Test
    public void fishIsAddedToList() {
        int aqMinSize = 25;
        l.generateFirstFishlist(aqMinSize);
        assertEquals(1, l.getSpeciesCount());
    }
    @Test
    public void onlySuitableSpeciesRecommended() {
        l.generateFirstFishlist(70);
        l.upDateFishList(notPossible); //IllegalStateException, korjaa tama
        assertEquals(1,l.getCurrentList().size());
    }
    
    
    

}
