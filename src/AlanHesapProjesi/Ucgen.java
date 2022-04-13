package AlanHesapProjesi;

public class Ucgen extends Sekil{
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(String isim, int kenar1, int kenar2, int kenar3) {
        super(isim);
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    public void alanHesapla() {
        double x=(kenar1+kenar2+kenar3)/2;
        double ucgenAlan=Math.sqrt(x*(x-kenar1)*(x-kenar2)*(x-kenar3));
        System.out.println(getIsim()+" in alani : "+ucgenAlan);
    }
}
