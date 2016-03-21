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
public class FishReferee {

    private Aquarium a;

    public FishReferee(Aquarium a) {
        this.a = a;
    }

    public void addFishToAquarium(Species s) {

        while (true) {
            if (s.getFloor().equals("top") && a.isTopFull() == true) {
                System.out.println("Pinta taynna");
                break;
            }
            if (s.getFloor().equals("bottom") && a.isBottomFull() == true) {
                System.out.println("Pohja taynna");
                break;
            }
            if (s.getFloor().equals("mid") && a.isMidFull() == true) {
                System.out.println("Keskivesi taynna");
                break;
            }
            if (s.getFloor().equals("mid")) {
                this.addMidFishToAquarium(s);
                break;
            }
            if (s.getFloor().equals("top")) {
                this.addTopFishToAquarium(s);
                break;
            }
            if (s.getFloor().equals("bottom")) {
                this.addBottomFishToAquarium(s);
                break;
            }

        }

    }

    public void addMidFishToAquarium(Species species) {
        int cm = 0;
        int i = 0;
        while (true) {
        while (i < a.fishListMid.size()) {
            if (a.fishListMid.isEmpty()) {
                break;
            }
            cm = cm + a.fishListMid.get(i).getLenght();
            i++;
        }
        if (cm + species.getLenght() > (a.getVolume() / 3)) {
            System.out.println("parvi näitä kaloja ei mahdu tänne");
            break;
        
        } else {
            Fish fish = new Fish();
            if (species.isSocial == true) {
            //Kutsutaan kayttoliittyman metodia: tehdaan metodi joka kysyy kayttajalta, montako kalaa han haluaa. Ilmoitetaan
            //myos minimi 7kpl, taytyy laskea mahtuuko. Metodi laskee: tilavuus/3 - midlistalla olevien kalojen yhteispituus
            //= X. X/species.getLenght kertoo montako kalaa voi maks ottaa. Jos tama < 7, tama kala ei sovi. Pyoristys kok
            //luku alaspain.
            break;
            }
            if (species.isSocial == false) {
                //lisaa kala
                break;
            }
            
        }
        }
    }
}
