package webprog.kinobilletter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class BillettController {
    private final ArrayList<Billett> billetter = new ArrayList<>();

    @GetMapping("/hentFilmer")
    public ArrayList<String> hentFilmer() {
        ArrayList<String> filmliste = new ArrayList<>();
        filmliste.add("Oppenheimer");
        filmliste.add("Barbie");
        filmliste.add("Anyone Like You");
        filmliste.add("Dune");
        return filmliste;
    }
    @PostMapping("/lagre")
    public void lagreBillett(Billett innBillett) {
        billetter.add(innBillett);
    }

    @GetMapping("/hentBilletter")
    public ArrayList<Billett> hentBilletter() {
        return billetter;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        billetter.clear();
    }
}
