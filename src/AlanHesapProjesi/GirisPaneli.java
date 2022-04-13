package AlanHesapProjesi;

import java.util.Scanner;

public class GirisPaneli {
    public GirisPaneli() {
    }

    public static void islemler() {

        Scanner scan = new Scanner(System.in);
        System.out.println(" İstediginiz Islemi Giriniz \n1-Kare Alan Hesabi\n2-Ucgen Alan Hesabi\n" +
                "3-Daire Alan Hesabi\n4-Cikis");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                System.out.print("Karenin bir kenar uzunlugunu giriniz : ");
                int kareKenar = scan.nextInt();
                Sekil kare = new Kare("Kare", kareKenar);
                kare.alanHesapla();
                islemler();
                break;
            case 2:
                System.out.print("Ucgenin 1.kenar uzunlugunu giriniz : ");
                int kenar1 = scan.nextInt();
                System.out.print("Ucgenin 2.kenar uzunlugunu giriniz : ");
                int kenar2 = scan.nextInt();
                System.out.print("Ucgenin 3.kenar uzunlugunu giriniz : ");
                int kenar3 = scan.nextInt();
                Sekil ucgen = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
                ucgen.alanHesapla();
                islemler();
                break;
            case 3:
                System.out.print("Dairenin yaricapini giriniz :");
                double yariCap=scan.nextDouble();
                Sekil daire=new Daire("Daire",yariCap);
                daire.alanHesapla();
                islemler();
                break;
            case 4:
                System.out.println("**** Iyı Gunler Dileriz ****");
                break;
            default:
                try {
                    System.out.println("hatali giris tekrar deneyiniz");
                    islemler();
                } catch (Exception e) {

                }
        }
    }


}
