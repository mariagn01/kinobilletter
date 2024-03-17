package webprog.kinobilletter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class BillettController {
    private final ArrayList<Billett> billetter = new ArrayList<>();

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
