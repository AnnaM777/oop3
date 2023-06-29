package Zadatak2;

public class Proizvod {

    private String naziv;
    private String sifra;
    private double cena;

    public Proizvod() {
    }

    public Proizvod(String naziv, String sifra, double cena) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "naziv='" + naziv + '\'' +
                ", sifra='" + sifra + '\'' +
                ", cena=" + cena +
                '}';
    }
}
