package DepoYonetimiProjesi;

public class Urunler {
    private String urunAdi;
    private String ureticiAdi;
    private int miktar;
    private String birim;
    private String raf;

    Urunler(){

    }

    public Urunler(String urunAdi, String ureticiAdi, int miktar, String birim, String raf) {
        this.urunAdi = urunAdi;
        this.ureticiAdi = ureticiAdi;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUreticiAdi() {
        return ureticiAdi;
    }

    public void setUreticiAdi(String ureticiAdi) {
        this.ureticiAdi = ureticiAdi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunAdi='" + urunAdi + '\'' +
                ", ureticiAdi='" + ureticiAdi + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
