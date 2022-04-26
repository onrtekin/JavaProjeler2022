package MaasProjesi;

public class Calisan{
    String isim;
    double maas;
    int haftalikCalismaSaati;
    int iseBaslamaYili;
    double vergi;
    double bonus;
    double maasArtisi;


    public Calisan(String isim, double maas, int haftalikCalismaSaati, int iseBaslamaYili) {
        this.isim = isim;
        this.maas = maas;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.iseBaslamaYili = iseBaslamaYili;
    }

    private void vergi() {//Maasa uygulanan vergiyi hesapliyoruz...

        if(this.maas<1000){
            System.out.println("Maas 1000 Tl'nin altinda oldugundan vergi hesaplanmayacak");
        }else{
            vergi=this.maas*0.04;

        }
    }

    private void bonusHesapla() {
        if(this.haftalikCalismaSaati>40){
            int hesap=this.haftalikCalismaSaati-40;
            bonus=30*hesap;

        }
    }

    private void maasArtisiHesapla() {
        if(2022-this.iseBaslamaYili>=5){
            maasArtisi=maas*0.10;
        }
    }
    public void bilgi(){
        System.out.println("*****Personel Bilgi Sistemine Hsogeldiniz*****\nHazirlaniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();

        System.out.println("Calisanin Adi Soyadi : "+this.isim);
        System.out.println("Calsanin Brut Maasi : "+this.maas+" TL");
        System.out.println("Calisma Saati : "+this.haftalikCalismaSaati+" Saat");
        System.out.println("Calisanin Baslangic Yili : "+this.iseBaslamaYili);
        System.out.println("Vergi Hesaplaniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();

        vergi();
        System.out.println("Vergi : "+vergi+" TL");
        System.out.println("Bonus Hesaplaniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        bonusHesapla();
        System.out.println("Bonus : "+bonus+" TL");
        System.out.println("Maas Artisi Hesaplaniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();

        maasArtisiHesapla();
        System.out.println("Maas artisi : "+maasArtisi+" TL");
        System.out.println("Net Maas Hesaplaniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();

        System.out.println("Net Maas : "+(this.maas+bonus+maasArtisi-vergi)+" TL");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        System.out.println("Iyi Gunler");

    }



}
