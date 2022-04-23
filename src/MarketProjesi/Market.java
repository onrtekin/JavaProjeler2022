package MarketProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static List<String> urunler = new ArrayList<String>();
    public static List<Double> fiyatlar = new ArrayList<Double>();
    public static List<String> sepetUrunler = new ArrayList<String>();
    public static List<Double> sepetKg = new ArrayList<Double>();
    public static List<Double> sepetFiyatlar = new ArrayList<Double>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        urunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma",
                "Muz  ", "Cilek", "Kavun", "Uzum", "Limon"));
        fiyatlar.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
        String devam;
        double toplamOdeme=0.0;
        do{
            urunListele();
            System.out.print("Lutfen almak istediginiz urunu seciniz : ");
            int urunNo=scan.nextInt();
            System.out.print("Lutfen agirlik giriniz : ");
            double kg= scan.nextDouble();
            sepeteEkle(urunNo,kg);
            toplamOdeme=Math.floor(sepeteYazdir());
            System.out.print("Alısverise devam etmek istiyorsaniz :'E'\n" +
                    "Devam etmek istemiyorsaniz :'H'\nBasiniz : ");
            devam=scan.next();
        }while(devam.equalsIgnoreCase("e"));
        odeme(toplamOdeme);

    }

    private static void odeme(double toplamOdeme) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("*************ODEME***************");
        System.out.println("Odenecek Toplam Tutar : "+toplamOdeme);
        double    nakit=0.0;
        do{
            System.out.print("Lutfen Nakit Giriniz : ");
            nakit= scan.nextDouble();
            if(nakit<toplamOdeme){
                System.out.println("Girdiginiz nakit tutar yetersiz  "+(toplamOdeme-nakit)+
                        "Tl yetersiz");
                System.out.println("Tekrar deneyiniz");

            }
        }while(nakit<toplamOdeme);
        double paraUstu=nakit-toplamOdeme;
        if(paraUstu>0){
            System.out.println("Para Ustu : "+paraUstu);

        }
        System.out.println("Iyi Gunler....");

    }

    private static double sepeteYazdir() {
        double fiyatToplami=0.0;
        double kgToplami=0.0;
        System.out.println("Urun Adi\tKg\tFiyat");
        System.out.println("*************************");
        for (int i = 0; i <sepetUrunler.size() ; i++) {
            System.out.println(sepetUrunler.get(i)+"\t\t"+sepetKg.get(i)+"\t"+sepetFiyatlar.get(i));
            fiyatToplami+=sepetFiyatlar.get(i);
            kgToplami+=sepetKg.get(i);
        }
        System.out.println("*******************************");
        System.out.println("Toplam :\t\t"+kgToplami+"Kg"+"\t"+fiyatToplami+"Tl");
        return fiyatToplami;
    }

    private static void sepeteEkle(int urunNo, double kg) {
        sepetUrunler.add(urunler.get(urunNo-1));
        sepetKg.add(kg);
        sepetFiyatlar.add(fiyatlar.get(urunNo-1)*kg);

    }


    private static void urunListele() {
        System.out.println("No\tUrunler \tFiyatlar");
        System.out.println("***\t******* \t********");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i+1)+ "\t" +urunler.get(i) +"\t \t"+fiyatlar.get(i) );

        }
    }
}
