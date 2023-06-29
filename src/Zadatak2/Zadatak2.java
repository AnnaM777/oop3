package Zadatak2;

import java.util.ArrayList;

/*
Jednu prodavnicu opisuju naziv, lokacija i proizvodi koje prodaje.Svaki proizvod sadrži naziv,
 sifru i cenu, a može biti prehrambeni i neprehrambeni.Ukoliko je proizvod prehrambeni, dodatno se čuva i
  rok važenja proizvoda.Ukoliko je proizvod neprehrambeni, dodatno se cuva i da li je zapaljiv.
  U main-u kreirati jednu prodavnicu i par proizvoda koje prodaje.
  Obezbediti metodu koja na kasi omogućava zaposlenom da pretraži proizvode u prodavnici po nazivu ili šifri.
  prodavnica (naziv(String), lokacija(String),
   listaProizvoda (array))proizvod (naziv(String), sifra(String), cena(double)):    - prehrambeni (rokVazenja(String))    - neprehrambeni (zapaljiv(boolean))

 */
public class Zadatak2 {
    public static void main(String[] args) {

        PrehrambeniProizvod prehrambeniProizvod = new PrehrambeniProizvod();
        prehrambeniProizvod.setNaziv("Makarone");
        prehrambeniProizvod.setSifra("8303");
        prehrambeniProizvod.setCena(65.50);
        prehrambeniProizvod.setRokVazenja("24.07.2024");
        NeprehrambeniProizvod neprehrambeniProizvod = new NeprehrambeniProizvod("Ariel", "4456", 1650, false);

        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        proizvodi.add(prehrambeniProizvod);
        proizvodi.add(neprehrambeniProizvod);


        Prodavnica prodavnica1 =  new Prodavnica("Idea" , "Novi Beograd", proizvodi );
        System.out.println(prodavnica1);

    }
}
