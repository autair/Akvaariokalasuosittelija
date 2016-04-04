/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akvaariokalasuosittelija.akvaariokalaprojekti;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author autair
 */
public class FishRefereeTest {

    FishReferee f;
    Species fake1;
    Aquarium a;
    ArrayList list;
    ArrayList toplist;
    Species fake2;
    Species fake3;
    Species fake4;
    Species fake5;

    @Before
    public void setUp() {
        fake1 = new Species("fake1", "latinFake1", 5, true, "mid", 60, 7.5, 8.0, 15, 30);
        fake2 = new Species("fake2", "latinFake2", 5, true, "mid", 60, 6.5, 7.1, 15, 30);
        fake3 = new Species("fake3", "latinFake3", 5, false, "top", 60, 7.5, 8.0, 21, 30);
        fake4 = new Species("fake4", "latinFake4", 5, true, "mid", 60, 7.0, 8.0, 15, 20);
        fake5 = new Species("fake5", "latinFake5", 5, true, "bottom", 60, 6.5, 7.0, 15, 30);
        a = new Aquarium(100);
        list = new ArrayList<Species>();
        list.add(fake1);
        list.add(fake2);
        list.add(fake3);
        list.add(fake4);
        list.add(fake5);
        toplist = new ArrayList<Species>();
        f = new FishReferee(list, a);
    }

    @Test
    public void fishListIsUpdated() {
        f.upDateFishList(fake5);
        assertEquals(2, f.getSpeciesCount());
    }

    @Test
    public void topListIsFormedCorrectly() {
        f.makeTopFishList();
        assertEquals(1, f.getTopList().size());
    }

    @Test
    public void bottomListIsFormedCorrectly() {
        f.makeBottomFishList();
        assertEquals(0, f.getTopList().size());
    }

    @Test
    public void midListIsFormedCorrectly() {
        f.makeMidFishList();
        assertEquals(0, f.getTopList().size());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
