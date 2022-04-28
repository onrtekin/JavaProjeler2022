package YurtDisiCikisProjesi;

import java.util.Scanner;

public class Islemler {
    public static void start() {
        System.out.println("*******************************************");
        System.out.println("Safranbolu Hava Limani Dis Hatlar Terminali");
        System.out.println("*******************************************");
        System.out.print("Islemler Icın Ana Menuye Yonlendiriliyorsunuz\n" +
                "Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
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

        System.out.println("**********************");
        System.out.println("Ana Menuye Hosgeldiniz");
        System.out.println("**********************");
        System.out.println("Yurtdisi Cikis Sartlari\n" +
                "***Yurtdisi Cikis Harci (100TL) Odenmis Olmalidir\n" +
                "***Gidiceginiz Ulkeye Ait Vizenizin Bulunmasi Gerekir\n" +
                "***Adli Makamlarca Verilmis Yurtdisina Cikis Yasaginizin Bulunmamasi Gerekir");
        System.out.println("*************************");
        System.out.print("Kontrollere Baslamak Icın : 1\n" +
                         "Cikis Icın                : 2\n" +
                         "Basiniz                   : ");
        int kontrol = scan.nextInt();
        switch (kontrol) {
            case 1:
                System.out.print("Kontrolleriniz Basliyor\n" +
                        "Lutfen Bekleyiniz");
                for (int i = 0; i < 4; i++) {
                    System.out.print("..");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();

                cikisHarciKontrol();
                break;
            case 2:
                cikis();
                break;
            default:
                System.out.print("Hatali Giris Yaptiniz\n" +
                        "Ana Menuye Aktariyoruz\n" +
                        "Lutfen Bekleyiniz");
                for (int i = 0; i < 4; i++) {
                    System.out.print("..");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();
                break;

        }

    }

    static void cikis() {
        System.out.println("İyi Gunler Dileriz....");
    }

    private static void cikisHarciKontrol() {
        Kisi yolcu = new Kisi();
        yolcu.cikisHarciOdemeKontrol();
    }
}
