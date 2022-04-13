package AlanHesapProjesi;

public class Kare extends Sekil{
    private int kenarUzunluk;

    public Kare(String isim, int kenarUzunluk) {
        super(isim);
        this.kenarUzunluk = kenarUzunluk;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+" nin alani : "+kenarUzunluk*kenarUzunluk);
    }
}
