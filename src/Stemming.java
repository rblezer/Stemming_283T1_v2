import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Stemming {

    private Kieslijst kieslijst;
    private int[][] stembiljetten = new int[50][2];

    public void voegStemmenToe() {
      //  in deze methode wordt de stem van de kandidaat in de bewuste partij met één verhoogd.
    }

    public void randomStemming() {
        //daar wordt precies 50 keer een stemming uit gebracht, door random een partij te kiezen en random uit die partij een kandidaat te kiezen.
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
//                     System.out.print(stembiljetten[k][l]);
//            }
//        }
    }

    public void showStemming() {
        // ShowStemming geeft de lijst weer in de output (mag met System.out.println)

        for (Partij p : kieslijst.getPartijlijst()) {
            // get partijnaam + aantalstemmen
            String partijlijst = (p.getNaam() + " " + p.getTotaalAantalStemmen());
            System.out.println(partijlijst);
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
