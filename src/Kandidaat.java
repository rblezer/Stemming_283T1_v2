public class Kandidaat {
    private String naam;

    public String getNaam() {
        return naam;
    }

    Kandidaat (String naam) {
        this.naam = naam;
    }

    public int getTotaalAantalStemmen() {
        return totaalAantalStemmen;
    }

    public void setTotaalAantalStemmen(int totaalAantalStemmen) {
        this.totaalAantalStemmen = totaalAantalStemmen++;
    }

    private int totaalAantalStemmen = 0;
}
