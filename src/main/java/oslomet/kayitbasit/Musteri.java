package oslomet.kayitbasit;

public class Musteri {
    private String isim;
    private String soyisim;
    private String arabaModel;
    private boolean ehliyet;

    public Musteri(String isim, String soyisim, String arabaModel, boolean ehliyet) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.arabaModel = arabaModel;
        this.ehliyet = ehliyet;
    }

    public Musteri(){}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getArabaModel() {
        return arabaModel;
    }

    public void setArabaModel(String arabaModel) {
        this.arabaModel = arabaModel;
    }

    public boolean isEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(boolean ehliyet) {
        this.ehliyet = ehliyet;
    }
}
