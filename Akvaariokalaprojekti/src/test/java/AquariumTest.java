/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import akvaariokalasuosittelija.akvaariokalaprojekti.Aquarium;
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
public class AquariumTest {
    
    public AquariumTest() {
    }
    
    Aquarium a;
    
    @Before
    public void setUp() {
        Aquarium a = new Aquarium(100);
    }
    
    @Test
    public void returnsCorrectVolume() {
        assertEquals(100, a.getVolume());
    }
    
    @Test
    public void returnsCorrectTopStatus1() {
        assertEquals(false, a.isTopFull());
    }
    
    @Test
    public void returnsCorrectTopStatus2() {
        a.setTopStatus(true);
        assertEquals(true, a.isTopFull());
    }
    
    @Test
    public void returnsCorrectMidStatus1() {
        assertEquals(false, a.isMidFull());
    }
    
    @Test
    public void returnsCorrectMidStatus2() {
        a.setMidStatus(true);
        assertEquals(true, a.isMidFull());
    }
    
    @Test
    public void returnsCorrectBottomStatus1() {
        assertEquals(false, a.isBottomFull());
    }
    
    @Test
    public void returnsCorrectBottomStatus2() {
        a.setBottomStatus(true);
        assertEquals(true, a.isBottomFull());
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
