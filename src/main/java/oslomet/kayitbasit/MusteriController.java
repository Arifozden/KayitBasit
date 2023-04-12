package oslomet.kayitbasit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MusteriController {
    private final List<Musteri> musteriler=new ArrayList<>();

    @GetMapping("musterileriGetir")
    public List<Musteri> tumMusteriler(){
        return musteriler;
    }

    @PostMapping("musteriKayit")
    public void musteriEkle(Musteri girMusteri){
        musteriler.add(girMusteri);
    }

    @GetMapping("hepsiniSil")
    public void hepsiniSil(){
        musteriler.clear();
    }
}
