package AlanHesapProjesi;

public class Daire extends Sekil{
    private double yariCap;

    public Daire(String isim, double yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+" nin alani :"+Math.PI*yariCap*yariCap);
    }
}