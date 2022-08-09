public class Kandidaat {
    private String naam;
    private int totaalAantalStemmen = 0;

    Kandidaat(String naam) {
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
}
