import java.util.ArrayList;
import java.util.List;

public class Partij {

    private String naam;
    private List<Kandidaat> kandidaten = new ArrayList<>();
    private int totaalAantalStemmen = 0;

    Partij(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void verhoogAantalStemmen() {
        this.totaalAantalStemmen++;
    }

    public int getTotaalAantalStemmen() {
        return totaalAantalStemmen;
    }

    public List<Kandidaat> getKandidaten() {
        return kandidaten;
    }

    public void addKandidaat(Kandidaat kandidaat) {
        kandidaten.add(kandidaat);
    }
}