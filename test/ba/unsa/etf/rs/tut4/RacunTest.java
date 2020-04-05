package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void test1() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("HLB", "Hljeb", 1.1), 2);
        r.dodajStavku(new Artikal("JAJ", "Jaje", 0.25), 5);
        assertEquals(3.45, r.ukupanIznos());
    }

    @Test
    void testPrazno() {
        Racun r = new Racun();
        assertEquals(0, r.ukupanIznos());
    }
    @Test
    void getArtikalTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 1.1));
    }
    @Test
    void setArtikalTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 1.1));
        r= new Racun(new Artikal("HLB", "Hljeb", 15), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 15));
    }
    @Test
    void getKolicinaTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertNotEquals(r.getKolicina(), 15);

    }
}