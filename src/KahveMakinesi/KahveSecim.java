package KahveMakinesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveSecim {
    static List<Giris> kahve = new ArrayList<>();
    static List<Giris> kahveSecilen = new ArrayList<>();
    static String arrBardak[] = {"Kucuk Boy", "Orta Boy", "Buyuk Boy"};
    static String arrSeker[] = {"Sekersiz", "Orta Sekerli", "Cok Sekerli"};
    static String arrSut[] = {"Sutsuz", "Orta Sutlu", "Bol Sutlu"};
    static Scanner scan = new Scanner(System.in);
    static int no;
    static int bardakNo;
    static int sekerSec;
    static int sutSecim;

    public void kahveTur() {
        Giris kahve1 = new Giris("Turk Kahvesi", "1");
        Giris kahve2 = new Giris("Espresso", "2");
        Giris kahve3 = new Giris("Americano", "3");
        Giris kahve4 = new Giris("Filtre Kahve", "4");
        kahve.add(kahve1);
        kahve.add(kahve2);
        kahve.add(kahve3);
        kahve.add(kahve4);
        sec();

    }

    private void sec() {
        for (Giris each : kahve) {
            System.out.println(each.getKahveNumara() +"\t"+ each.getKahveAdi());
        }
        System.out.print("Sectiginiz kahve no giriniz : ");
        no = scan.nextInt();

        switch (no) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("hatali giris tekrar deneyiniz");
                sec();
        }

        bardakSec();
    }

    private void bardakSec() {
        System.out.println("1-Kucuk Boy\n2-Orta Boy\n3-BuyukBoy \nLutfen bardak tercihinizi seciniz :");
        bardakNo = scan.nextInt();
        switch (bardakNo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("hatali giris tekrar deneyiniz");
                bardakSec();
        }

        sekerSec();

    }

    private void sekerSec() {
        System.out.print("1-Sekersiz\n2-Orta Sekerli\n3-Cok Sekerli\nLutfen Seker Tercihnizi Giriniz :");
        sekerSec = scan.nextInt();
        switch (sekerSec) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Hatali Giris Tekrar Deneyiniz : ");
                sekerSec();

        }

        sutSec();
    }

    private void sutSec() {
        System.out.print("1-Sutsuz" +
                "\n2-Orta Sutlu\n3-Bol Sutlu\nLutfen Sut Tercihinizi Giriniz :");
        sutSecim = scan.nextInt();
        switch (sutSecim) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Hatali Giris Lutfen Tekrar Deneyiniz ");
                sutSec();
        }

        kahveHazirla();
    }

    public void kahveHazirla() {
        System.out.println("Seciminiz : " + kahve.get(no - 1).getKahveAdi() + "\n" + "" +
                "Sectiginiz Bardak : " + arrBardak[bardakNo - 1] + "\n" +
                "Sectiginiz Seker : " + arrSeker[sekerSec - 1] + "\n" +
                "Sectiginiz Sut : " + arrSut[sutSecim - 1]);
        System.out.print("Seciminizi Onayliyorsaniz 1\n" +
                "Secimlerinizi Yenilemek Icin 2'ye Basiniz : ");
        int sonSecim = scan.nextInt();

        if (sonSecim == 1) {
            System.out.println(kahve.get(no - 1).getKahveAdi() + " hazirlaniyor lutfen bekleyiniz");
            for (int i = 0; i < 6; i++) {
                System.out.print(".");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            if(sekerSec!=1){
                System.out.println();
                System.out.println("Seker ekleniyor Lütfen Bekleyiniz");
                for (int i = 0; i <3 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }

                }
            }
            if(sutSecim!=1){
                System.out.println();
                System.out.println("Sut ekleniyor Lütfen Bekleyiniz");
                for (int i = 0; i <3 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }

                }
            }
            System.out.println();
            System.out.println("Kahveniz Hazir afiyet Olsun...");

        }else if(sonSecim==2){
            sec();
        }else{
            System.out.println("Hatali Giris Tekrar eneyiniz");
            kahveHazirla();
        }

    }


}

