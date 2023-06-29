package Zadatak2;

public class NeprehrambeniProizvod extends Proizvod {
    private boolean zapaljiv;

    public NeprehrambeniProizvod(boolean zapaljiv) {
        this.zapaljiv = zapaljiv;
    }

    public NeprehrambeniProizvod(String naziv, String sifra, double cena, boolean zapaljiv) {
        super(naziv, sifra, cena);
        this.zapaljiv = zapaljiv;
    }

    public boolean isZapaljiv() {
        return zapaljiv;
    }

    public void setZapaljiv(boolean zapaljiv) {
        this.zapaljiv = zapaljiv;
    }

    @Override
    public String toString() {
        return super.toString() + "NeprehrambeniProizvod{" +
                "zapaljiv=" + zapaljiv +
                "} " ;
    }
}
