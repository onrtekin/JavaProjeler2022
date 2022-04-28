package SansliKullaniciProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SansliKullaniciProjesi.Islemler.anaMenu;

public class Kayit {
    static List<User> kullanicilar=new ArrayList<>();

    public static List<User> kayitAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Adinizi Soyadinizi Giriniz  : ");
        String kayit=scan.nextLine();
        User kullanici=new User(kayit, LocalDateTime.now());
        kullanicilar.add(kullanici);
        System.out.print("Isleminiz Basari Ile Gerceklestirildi\n" +
                "Ana Menuye Yonlendiriliyorsunuz" +
                "\nLutfen Bekleyiniz");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        anaMenu();

       return kullanicilar;
    }
    public static void mutluKullanicilariYazdir(){
        System.out.print(" Sansli Kullanici Araniyor Lutfen Bekleyiniz");

        for (int i = 0; i <4 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        for (User w:kullanicilar) {
            if(w.kayitZamani.getSecond()<10){
                System.out.println("Tebrikler Sansli Kisi :  "+w.name);
            }
        }
        System.out.print("Ana Menuye Yonlendiriliyorsunuz" +
                "\nLutfen Bekleyiniz");
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
    public static void tumKullanicilariYazdir(){
        System.out.print("Kullanici Listeleme Menusune Hosgeldiniz\n" +
                "Lutfen Bekleyiniz");

        for (int i = 0; i <4 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        for (User w:kullanicilar) {
            System.out.println("Adi Soyadi : "+w.name+" Kayit Tarihi : "+w.kayitZamani);
        }
        System.out.print("Ana Menuye Yonlendiriliyorsunuz" +
                "\nLutfen Bekleyiniz");
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
