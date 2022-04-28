package SansliKullaniciProjesi;

import java.util.Scanner;


public class Islemler extends Kayit {

    public static void kullaniciKayitSistemi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("KULLANİCİ KAYİT SİSTEMİNE HOSGELDİNİZ");
        System.out.println("*************************************");
        System.out.print("Ana Menuye Aktariliyorsunuz Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        anaMenu();
    }


    static void anaMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("***********ANA MENU******************");
        System.out.println("1-Yeni Kullanici Ekleme\n2-Kullanici Listeleme\n" +
                "3-Sansli Kisi Bulma\n4-Cikis");
        System.out.print("Lutfen Seciminizi Yapiniz : ");
        int secim = scan.nextInt();

        switch (secim) {

            case 1:
                System.out.print("Yeni Kullanici Ekleme Menusune Hosgeldiniz\n" +
                        "Lutfen Bekleyiniz");
                for (int i = 0; i < 5; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();
                kayitAl();
                break;
            case 2:

                tumKullanicilariYazdir();
                break;
            case 3:
                mutluKullanicilariYazdir();
                break;
            case 4:
                System.out.println("Iyı Gunler Dileriz....");
                break;
            default:
                System.out.print("Hatli Giris Yaptiniz\nAna Menuye Yonlendiriliyorsunuz" +
                        "Lutfen Bekleyiniz");
                for (int i = 0; i < 5; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();
                anaMenu();
        }
    }
}