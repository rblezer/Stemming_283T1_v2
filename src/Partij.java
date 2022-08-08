import java.util.ArrayList;
import java.util.List;

public class Partij {
    private String naam;
    private List<Kandidaat> kandidaten = new ArrayList<>();


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Kandidaat> getKandidaten() {
        return kandidaten;
    }

    public void addKandidaat(Kandidaat kandidaat) {
       kandidaten.add(kandidaat);
    }

    public int getTotaalAantalStemmen() {
        return totaalAantalStemmen;
    }

    public void setTotaalAantalStemmen(int totaalAantalStemmen) {
        this.totaalAantalStemmen = totaalAantalStemmen;
    }

    private int totaalAantalStemmen = 0;
}
