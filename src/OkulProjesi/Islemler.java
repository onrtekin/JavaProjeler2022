package OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    private List <Kisi> ogrenciListesi= new ArrayList <>();
    private List <Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("    OGRENCI VE OGRETMEN ANA MENU");
        System.out.println("************************************");
        System.out.println("1- OGRENCI ISLEMLERI");
        System.out.println("2- OGRETMEN ISLEMLERI");
        System.out.println("3- CIKIS");
        String tercih = scan.next();

        if(tercih.equals("3")){
            cikis();
        }else if (tercih.equals("1")){
            kisiTuru = "OGRENCI";
            islemlerMenusu();
        }else if(tercih.equals("2")) {
            kisiTuru = "OGRETMEN";
            islemlerMenusu();
        }else {
            System.out.println("Hatali Giris");
            menu();
        }
    }

    private void islemlerMenusu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("*************ISLEMLER ******************");
        System.out.println("1-EKLEME");
        System.out.println("2-ARAMA");
        System.out.println("3-LISTELEME");
        System.out.println("4-SILME");
        System.out.println("5-ANA MENÜ");
        System.out.println("6-CIKIS\n");
        System.out.println("SECIMINIZ:");
        String tercih = scan.next();

        switch(tercih) {
            case "1":
                ekle();
                break;
            case "2":
                ara();
                break;
            case "3":
                listele();
                break;
            case "4":
                sil();
                break;
            case "5":
                menu();
                break;
            case "6":
                cikis();
                break;
            default: 	System.out.println("Yanlis Giris");
                islemlerMenusu();
                break;
        }
    }

    private void cikis() {
        System.out.println("IYI GUNLER ...");
    }

    private void ekle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******************** "+ kisiTuru + " EKLEME ***********************");
        System.out.print("Ad Soyad:");
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik No:");
        String kimlikNo = scan.next();
        System.out.print("Yas:");
        int yas = scan.nextInt();

        if(kisiTuru.equals("OGRENCI")) {
            System.out.print("Sinif:");
            String sinif = scan.next();
            System.out.print("Okul No:");
            String numara = scan.next();
            Ogrenci  ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
            kisiEkle(ogrenci,ogrenciListesi);
        }else {
            System.out.print("SicilNo:");
            String sicilNo = scan.next();
            System.out.print("Bolum:");
            String bolum = scan.next();
            Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            kisiEkle(ogretmen,ogretmenListesi);
        }
        islemlerMenusu();
    }

    private void ara(){

        Scanner scan = new Scanner(System.in);
        System.out.println("******************* " + kisiTuru + " BILGILERI *******************");
        System.out.print("Aradiginiz Kisinin Kimlik Numarasi:");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            kimlikNoIleKisiAra(kimlikNo, ogrenciListesi);
        }else {
            kimlikNoIleKisiAra(kimlikNo, ogretmenListesi);
        }
        islemlerMenusu();
    }

    private void listele () {
        List <Kisi> liste;
        if (kisiTuru.equals("OGRENCI")) {
            liste = ogrenciListesi;
        }else{
            liste = ogretmenListesi;
        }

        if(liste.isEmpty()){
            System.out.println("Belirtilen listede herhangi bir kayit yoktur");
        }else {
            System.out.println("************ "+ kisiTuru + " LISTESI ************\n");
            for(Kisi w: liste) {
                System.out.println(w);
            }
        }
        islemlerMenusu();
    }

    private void sil() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Silmek IstediGiniz "+ kisiTuru + " nin Kimlik Numarası:");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            kisiSil(kimlikNo, ogrenciListesi);
        }else {
            kisiSil(kimlikNo, ogretmenListesi);
        }
        islemlerMenusu();
    }
    private void kisiSil(String kimlikNo, List <Kisi> liste) {
        for (int i = 0; i < liste.size(); i++) {
            if(kimlikNo.equals(liste.get(i).getKimlikNo())){
                liste.remove(i);
                System.out.println(kimlikNo + " lu "+ kisiTuru +" Silindi");
                islemlerMenusu();
            }


        }System.out.println(kimlikNo + " lu "+ kisiTuru +" Kayidi bulunamadi");

        islemlerMenusu();
    }

    private void kisiEkle(Kisi kisi, List <Kisi> liste) {

        for(Kisi w : liste) {
            if(kisi.getKimlikNo().equals(w.getKimlikNo()) ) {
                System.out.println(kisi.getKimlikNo() + " nolu Kisi sisteme kayitli.");
                islemlerMenusu();
            }
        }
        liste.add(kisi);
        System.out.println(kisi.getAdSoyad() + " Sisteme Eklenmistir.");
    }

    private void kimlikNoIleKisiAra (String kimlikNo, List<Kisi> liste) {

        for(Kisi w : liste) {
            if(w.getKimlikNo().equals(kimlikNo)) {
                System.out.println(w);
                return;
            }
        }
        System.out.println("Aradiginiz kisi bulunamamistir.");
    }

}
