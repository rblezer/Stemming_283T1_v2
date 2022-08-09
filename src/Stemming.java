import java.util.List;

public class Stemming {

    private Kieslijst kieslijst;


    private int[][] stembiljetten = new int[50][2];

    public void randomStemming() {
        //Vul de stembiljetten array random met partij en kandidaten
        for (int i = 0; i < stembiljetten.length; i++) {
            //Random 0-2 voor partij
            stembiljetten[i][0] = ((int) (Math.random() * 3));
        }
        for (int j = 0; j < stembiljetten.length; j++) {
            //Random 0-1 voor kandidaat stem;
            stembiljetten[j][1] = ((int) (Math.random() * 15));
        }
//        for (int k=0; k < stembiljetten.length; k++){
//            for (int l =0; l < stembiljetten[k].length; l++){
//                System.out.println(stembiljetten[k][l]);
//            }
//        }
    }

    public void voegStemmenToe() {

        //1. Lees stembiljetten array
        //2. Pak de juiste partij uit de kieslijst
        //3. Hoog het aantal partij stemmen op met 1
        //4. Pak de juiste kandidaat uit de partij
        //5. Verhoog het aantal stemmem voor de kandidaat.

        List<Partij> partijlijst = kieslijst.getPartijlijst();

        for (int i = 0; i < stembiljetten.length; i++) {

            Partij pvda = partijlijst.get(0);
            if (stembiljetten[i][0] == 0) {
                pvda.verhoogAantalStemmen();
            }
            Partij cda = partijlijst.get(1);
            if (stembiljetten[i][0] == 1) {
                cda.verhoogAantalStemmen();
            }
            Partij vvd = partijlijst.get(2);
            if (stembiljetten[i][0] == 2) {
                vvd.verhoogAantalStemmen();
            }
        }
        List<Partij> kieslijstKanditaten = kieslijst.getPartijlijst();
        for (int i = 0; i < kieslijstKanditaten.size(); i++) {
            Partij p = kieslijstKanditaten.get(i);

            for (int j = 0; j < p.getKandidaten().size(); j++) {
                // for (int stemCount = 0; stemCount < stembiljetten.length; stemCount++) {
                System.out.print(p.getKandidaten().get(j).getNaam() + " ");
                //  }
            }

        }
        System.out.println();
    }

    public void showStemming() {
        //Print de waardes uit de stembiljetten array

        for (Partij p : kieslijst.getPartijlijst()) {
            // get partijnaam + aantalstemmen
            System.out.println(p.getNaam() + " " + p.getTotaalAantalStemmen());
            System.out.println();
            // get
            for (int j = 0; j < p.getKandidaten().size(); j++) {
                System.out.println(p.getKandidaten().get(j).getNaam() + " " + (p.getKandidaten().get(j).getTotaalAantalStemmen()));
            }
            System.out.println();
        }
    }


    public Kieslijst getKieslijst() {
        return kieslijst;
    }

    public void setKieslijst(Kieslijst kieslijst) {
        this.kieslijst = kieslijst;
    }
}