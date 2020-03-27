package ba.unsa.etf.rs.tut4;
import java.util.ArrayList;

public class Artikal {

    private String sifra, naziv;
    private double cijena;

    public Artikal(String sifra, String naziv, double cijena){
        this.cijena= cijena;
        this.sifra= sifra;
        this.naziv= naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public Artikal(String s) {  //konstruktor
        /*
        konstruktor koji prima jedan argument tipa String oblika
        "šifra,naziv,cijena" (string u kojem su šifra, naziv i cijena
        artikla razdvojeni zarezom);
         */
        String[] rez = s.split(",");
        setSifra(rez[0]);
        setNaziv(rez[1]);
        setCijena(Double.parseDouble(rez[2]));
    }

    /*
    metodu toString koja vraća string istog oblika kao onaj kojeg prima upravo
    opisani konstruktor - podsjetimo se sa predavanja da je ovo ustvari metoda
    klase Object koju "preklapamo" u našoj klasi Artikal;
     */
    public String toString(){
        String s = "";
        s = s + this.getSifra() + "," + this.getNaziv() + "," + this.getCijena();
        return s;
    }

    public boolean equals(Object o) {
        Artikal artikal = (Artikal)o;
        return (this.sifra.equals(((Artikal) o).sifra) &&
                this.naziv.equals(((Artikal) o).naziv) &&
                this.cijena == ((Artikal) o).cijena);
    }

    /*
    javnu statičku metodu izbaciDuplikate koja prima ArrayList artikala,
    te iz ove liste izbacuje sve duplikate i tako prečišćenu listu vraća;
    pod pojmom "duplikata" smatraju se dva artikla koji posjeduju istu šifru, naziv i cijenu;
     */

    public static void izbaciDuplikate (ArrayList<Artikal> artikli){
        for (int i = 0; i < artikli.size(); i++) {
            for (int j = i + 1; j < artikli.size(); j++) {
                if(artikli.get(i).equals(artikli.get(j)))
                    artikli.remove(j);
            }
        }
    }
}