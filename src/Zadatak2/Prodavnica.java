package Zadatak2;

import java.util.ArrayList;

/*
Jednu prodavnicu opisuju naziv, lokacija i proizvodi koje prodaje.Svaki proizvod sadrži naziv,
 sifru i cenu, a može biti prehrambeni i neprehrambeni.Ukoliko je proizvod prehrambeni, dodatno se čuva i
  rok važenja proizvoda.Ukoliko je proizvod neprehrambeni, dodatno se cuva i da li je zapaljiv.
  U main-u kreirati jednu prodavnicu i par proizvoda koje prodaje.Obezbediti metodu koja na kasi
  omogućava zaposlenom da pretraži proizvode u prodavnici po nazivu ili šifri.prodavnica (naziv(String), lokacija(String),
   listaProizvoda (array))proizvod (naziv(String), sifra(String), cena(double)):    - prehrambeni (rokVazenja(String))    - neprehrambeni (zapaljiv(boolean))

 */
public class Prodavnica {
    private String naziv;
    private String lokacija;
    private ArrayList<Proizvod> proizvodi = new ArrayList<>();

    public Prodavnica() {
    }

    public Prodavnica(String naziv, String lokacija, ArrayList<Proizvod> proizvodi) {
        this.naziv = naziv;
        this.lokacija = lokacija;
        this.proizvodi = proizvodi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public ArrayList<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(ArrayList<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }
    // Obezbediti metodu koja na kasi omogućava zaposlenom da pretraži proizvode u prodavnici po nazivu ili šifri.

    public Proizvod filtritranjeProizvoda(String  nazivSifra){
        String pretragaProizvoda = nazivSifra;
        if (proizvodi.contains(nazivSifra)){
            pretragaProizvoda = nazivSifra;
        }
        return filtritranjeProizvoda(nazivSifra);
    }
}
