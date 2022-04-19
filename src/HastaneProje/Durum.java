package HastaneProje;

public class Durum {
    private String aktüelDurum;
    private boolean aciliyetDurumu;

    public String getAktüelDurum() {
        return aktüelDurum;
    }

    public void setAktüelDurum(String aktüelDurum) {
        this.aktüelDurum = aktüelDurum;
    }

    public boolean isAciliyetDurumu() {
        return aciliyetDurumu;
    }

    public void setAciliyetDurumu(boolean aciliyetDurumu) {
        this.aciliyetDurumu = aciliyetDurumu;
    }
    public boolean aciliyetDurumu(){return aciliyetDurumu;}
    public void setAciliyet(boolean aciliyetDurumu){
        this.aciliyetDurumu=aciliyetDurumu();
    }
}