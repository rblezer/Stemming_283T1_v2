import java.util.ArrayList;
import java.util.List;

public class Kieslijst {

    private List<Partij> partijlijst = new ArrayList<>();

    public List<Partij> getPartijlijst() {
        return partijlijst;
    }

    public void addPartij(Partij partij) {
        partijlijst.add(partij);
    }
}