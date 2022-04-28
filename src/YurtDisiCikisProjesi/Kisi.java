package YurtDisiCikisProjesi;

import java.util.Scanner;

import static YurtDisiCikisProjesi.Islemler.anaMenu;
import static YurtDisiCikisProjesi.Islemler.cikis;

public class Kisi implements CıkısKurallari{

    private int cikisHarci;
    private boolean yurtDisiCikisYasagi;
    private boolean vizeDurumu;

    @Override
    public boolean yurtDisiCikisYasagiKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************");
        System.out.print("Cikis Yasagi Durumu\n" +
                "Var ise---> Evet\n" +
                "Yok ise--->Hayir\n" +
                "*****************\n" +
                "Giriniz : ");
        String yasakCevap=scan.next().toLowerCase();

        if(yasakCevap.equals("evet")){
            this.yurtDisiCikisYasagi=true;
            System.out.print("Cikis Yasagi Durumunuz Sistemde Kontrol Ediliyor\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            System.out.println("*****************************************");

            System.out.println("Yurt disina cikis yasaginiz bulunmaktadir\n" +
                    "Cikis Yapamazsiniz");
            System.out.println("*****************************************");
            return false;
        }else{
            System.out.print("Cikis Yasagi Durumunuz Sistemde Kontrol Ediliyor\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            System.out.println("*******************************************");
            System.out.println("Yurt Disina Cikis Yasaginiz Bulunmamaktadir");
            System.out.println("*******************************************");
            System.out.print("Son Kontroller Yapiliyor\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
           cikis();

        return true;

        }

    }

    @Override
    public boolean vizeKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.println("***********");
        System.out.print("Vize Durumu\n" +
                "Var ise---> Evet\n" +
                "Yok ise--->Hayir\n" +
                "**************\n" +
                "Giriniz : ");
        String vizeCevap=scan.next().toLowerCase();
        System.out.print("Vize Durumu Sistemde Kontrol Ediliyor\n" +
                "Lutfen Bekleyiniz");
        for (int i = 0; i <4 ; i++) {
            System.out.print("..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        if(vizeCevap.equals("evet")){
            this.vizeDurumu=true;
            System.out.println("**************************************");

            System.out.println("Vize Islemlerinde Sorun Bulunmamaktadir");
            System.out.println("***************************************");
            System.out.print("Cikis Yasagi Kontrol Menusune Aktariyoruz\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            yurtDisiCikisYasagiKontrol();
            return true;
        }else{
            System.out.println("***********************");
            System.out.println("Vizeniz Bulunmamaktadir");
            System.out.println("***********************");
            System.out.print("Lutfen Vize Alarak Tekrar Deneyiniz\nAna Menuye Aktariyoruz\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
            return false;
        }

    }

    @Override
    public  boolean cikisHarciOdemeKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.print("Lufen Odediginiz Harc Miktarini Giriniz : ");

        this.cikisHarci=scan.nextInt();
        System.out.println();
        System.out.print("Yaptiginiz Odeme Sistemde Kontrol Ediliyor\n" +
                "Lutfen Bekleyiniz");
        for (int i = 0; i <4 ; i++) {
            System.out.print("..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        if(this.cikisHarci<100){
            System.out.println("Cikis Harci 100 TL -->Yatirdiginiz Tutar Eksik\n" +
                    "Yatirdiginiz Tutar : "+cikisHarci+" "+" TL -->Eksik Tutar : "+(100-cikisHarci)+" Tl");
            System.out.print("Ana Menuye Aktariyoruz\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
            return false;
        }else{
            System.out.println("*************************************");
            System.out.println("Harc Yatirma Islemi Gerceklestirilmis");
            System.out.println("*************************************");
            System.out.print("Vize Kontrol Menusune Aktariyoruz\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            vizeKontrol();
            return true;
        }

    }
}
