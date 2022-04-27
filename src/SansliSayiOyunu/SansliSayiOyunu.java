package SansliSayiOyunu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SansliSayiOyunu {

    static int sayi;
    static List<Integer> sayilar = new ArrayList<>();

    public static void oyunaBasla() {

        System.out.println("****Sansli Sayi Oyununa Hosgeldiniz****");
        System.out.println("***************************************" +
                "\nKurallar\n***************************************\n1-5'ten az olmamak kaydiyla isteginiz" +
                " kadar sayi girebilirsiniz\n2-Bigisayar randoom olarak belirleyecegi" +
                " sayi kadar elemani sizin belirlediginiz sayilardan silecek" +
                "\n3-Son kalan 1 sayi sansli sayi olacak\n" +
                "*************************************** ");
        System.out.print("OYUN BASLİYOR");
        for (int i = 0; i < 6; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        oyunaDevam();
    }

    private static void oyunaDevam() {
        Scanner scan = new Scanner(System.in);
        boolean devam=true;
        while (true) {
            System.out.println("Cikmak icin herhangi bir harfe basiniz  ");
            System.out.print("Lutfen bir sayi giriniz : ");
            try {
                sayi=scan.nextInt();
            } catch (Exception e) {
                kacSayiKontrol();
                devam=false;
                break;

            }


            sayilar.add(sayi);

        }
    }
    private static void kacSayiKontrol() {
        if (sayilar.size() < 5) {
            System.out.print("En az 5 sayi girilmesi gerekiyor");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            oyunaDevam();
        }else{
            randoomSilme();
        }
    }

    private static void randoomSilme() {
        System.out.println("Girmis oldugunuz sayilar randoom olarak belirlenen sayilarda, index'lerde random sekilde sliniyor");

        while (sayilar.size() > 1) {
            int silinecekElemanSayisi = (int) (1+Math.random() * 4);
            if(silinecekElemanSayisi<sayilar.size()){
                for (int i = 0; i < silinecekElemanSayisi; i++) {
                    sayilar.remove((int) (Math.random() * sayilar.size()));
                }
            }
        }
        System.out.print("Sansli Sayi Araniyor");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }

        }
        System.out.println();

        System.out.println("Sansli Sayi : " + sayilar);



    }
}