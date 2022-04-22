package KahveMakinesi;

public class Giris {
    private String kahveAdi;
    private String kahveNumara;
    private String kahveBoy;
    private String sut;
    private String seker;

    public Giris() {

    }

    public Giris(String kahveAdi, String kahveNumara) {
        this.kahveAdi = kahveAdi;
        this.kahveNumara = kahveNumara;
    }

    public Giris(String kahveAdi, String kahveNumara, String kahveBoy, String sut, String seker) {
        this.kahveAdi = kahveAdi;
        this.kahveNumara = kahveNumara;
        this.kahveBoy = kahveBoy;
        this.sut = sut;
        this.seker = seker;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getKahveNumara() {
        return kahveNumara;
    }

    public void setKahveNumara(String kahveNumara) {
        this.kahveNumara = kahveNumara;
    }

    public String getKahveBoy() {
        return kahveBoy;
    }

    public void setKahveBoy(String kahveBoy) {
        this.kahveBoy = kahveBoy;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    @Override
    public String toString() {
        return "Giris{" +
                "kahveAdi='" + kahveAdi + '\'' +
                ", kahveNumara='" + kahveNumara + '\'' +
                ", kahveBoy='" + kahveBoy + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                '}';
    }
}
