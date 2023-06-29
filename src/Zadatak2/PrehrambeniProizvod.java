package Zadatak2;

public class PrehrambeniProizvod extends Proizvod {

    private String rokVazenja;

    public PrehrambeniProizvod() {
    }

    public String getRokVazenja() {
        return rokVazenja;
    }

    public void setRokVazenja(String rokVazenja) {
        this.rokVazenja = rokVazenja;
    }

    @Override
    public String toString() {
        return super.toString() +"PrehrambeniProizvod{" +
                "rokVazenja='" + rokVazenja + '\'' +
                "} " ;
    }
}
