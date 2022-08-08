public class Main {

    public static void main(String[] args) {

        Kieslijst kieslijst = new Kieslijst();

        Partij pvda = new Partij();
        pvda.setNaam("PVDA");
        kieslijst.setPartijlijst(pvda);

        Kandidaat Jan = new Kandidaat("Jan");
        pvda.addKandidaat(Jan);

        Kandidaat Piet = new Kandidaat("Piet");
        pvda.addKandidaat(Piet);

        Kandidaat Klaas = new Kandidaat("Klaas");
        pvda.addKandidaat(Klaas);

        Kandidaat Marie = new Kandidaat("Marie");
        pvda.addKandidaat(Marie);

        Kandidaat Gerry = new Kandidaat("Gerry");
        pvda.addKandidaat(Gerry);


        Partij cda = new Partij();
        cda.setNaam("CDA");
        kieslijst.setPartijlijst(cda);

        Kandidaat Lies  = new Kandidaat("Lies");
        cda.addKandidaat(Lies );

        Kandidaat Marieke = new Kandidaat("Marieke");
        cda.addKandidaat(Marieke);

        Kandidaat Joop  = new Kandidaat("Joop");
        cda.addKandidaat(Joop );

        Kandidaat Hannie = new Kandidaat("Hannie");
        cda.addKandidaat(Hannie);

        Partij vvd = new Partij();
        vvd.setNaam("VVD");
        kieslijst.setPartijlijst(vvd);

        Kandidaat Lubbers = new Kandidaat("Lubbers");
        vvd.addKandidaat(Lubbers);

        Kandidaat Kok = new Kandidaat("Kok");
        vvd.addKandidaat(Kok);

        Kandidaat Hans = new Kandidaat("Hans");
        vvd.addKandidaat(Hans);

        Kandidaat Paula = new Kandidaat("Paula");
        vvd.addKandidaat(Paula);

        Kandidaat Sientje = new Kandidaat("Sientje");
        vvd.addKandidaat(Sientje);

        Kandidaat Martie = new Kandidaat("Martie");
        vvd.addKandidaat(Martie);

        Stemming stemming = new Stemming();
        stemming.setKieslijst(kieslijst);

        stemming.randomStemming();
        stemming.voegStemmenToe();
        stemming.showStemming();

    }
}