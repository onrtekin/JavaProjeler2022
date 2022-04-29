package DepoYonetimiProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {

    static Map<Integer, Urunler> urunler = new HashMap<Integer, Urunler>();

    public static void anaMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********DEPO YONETİM SİSTEMİ ANA MODULUNE HOS GELDİNİZ************");
        System.out.print("1-URUN GİRİS\n2-MIKTAR GUNCELLEME\n3-RAF GUNCELLEME\n" +
                "4-URUN SILME\n5-URUN LISTELEME\n6-CIKIS\n" +
                "Lutfen Yapmak Istediginiz Islemi seciniz : ");

        int secim;
        while (true) {
            try {
                secim = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lutfen Sayi Girisi Yapiniz");
            }
        }
        System.out.print("Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        switch (secim) {
            case 1:
                urunGiris();
                break;
            case 2:
                miktariGuncelle();
                break;
            case 3:
                rafGuncelle();
                break;
            case 4:
                urunSil();
                break;
            case 5:
                urunListele();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz\n" +
                        "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
                for (int i = 0; i < 4; i++) {
                    System.out.print("..");
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();
                anaMenu();
                break;
        }


    }

    private static void cikis() {

        System.out.println("Iyi Gunler Dileriz......");

    }

    private static void urunListele() {
        System.out.println("*********Urunler Listesi************");
        System.out.println(urunler);
        System.out.println("Isleminiz Basari Ile Gerceklestirildi\n" +
                "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }

        System.out.println();


        anaMenu();

    }

    private static void urunSil() {
        Scanner scanner = new Scanner(System.in);
        int arananId;
        while (true) {

            try {
                System.out.print("Lutfen Silmek Istediginiz Urun Id'sini Giriniz : ");
                arananId = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Urun Id'si Sayi Olmalidir\n" +
                        "Lutfen Tekrar Deneyiniz : ");
            }
        }
        System.out.print("Urun Araniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        if (urunler.containsKey(arananId)) {
            System.out.println("Aradiginiz Urun :  " + urunler.get(arananId));
            System.out.print("Urun Sistemden Siliniyor\n" +
                    "Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
          urunler.remove(arananId);
            System.out.print("Isleminiz Basari Ile Gerceklestirildi\n" +
                    "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
        } else {
            System.out.println("Aradiginiz Urunu Sistemde Kayitli Degil\n" +
                    "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
        }

    }
    private static void rafGuncelle() {
        Scanner scanner = new Scanner(System.in);
        int arananId;
        while (true) {

            try {
                System.out.print("Lutfen Rafini Guncellemek Istediginiz Urunu Id'sini Giriniz : ");
                arananId = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Urun Id'si Sayi Olmalidir\n" +
                        "Tekrar Deneyiniz : ");
            }
        }
        System.out.println();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("Guncellemek Istediginiz Raf Degerini Giriniz : ");
            String gnclRaf = scanner.next();
            urunler.get(arananId).setRaf(gnclRaf);
            System.out.print("Isleminiz Gerceklestiriliyor Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            System.out.println("Isleminiz Basari Ile Gerceklestirildi");
            System.out.println("Guncel Raf  : " + urunler.get(arananId).getRaf());
            System.out.print("Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();

        } else {
            System.out.print("Aradiginiz Urun Id'si Sistemde Kayitli Degil\n" +
                    "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
        }

    }
    private static void miktariGuncelle() {
        Scanner scanner = new Scanner(System.in);
        int arananId;
        while (true) {
            try {
                System.out.print("Guncelleme Yapacaginiz Urun Id'sini Giriniz : ");
                arananId = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Urun Id'si Sayi Olmalidir\n" +
                        "Lutfen Sayi Giriniz : ");
            }
        }
        System.out.print("Urun Id'si Araniyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        if (urunler.containsKey(arananId)) {
            System.out.print("*****************" +
                    "\n1-Miktar Ekleme\n" +
                    "2-Miktar Eksiltme\n" +
                    "3-Ana Menu\n" +
                    "*****************\n" +
                    "Lutfen Seciminizi Yapiniz: ");
            int secim;
            while (true) {
                try {

                    secim = Integer.parseInt(scanner.next());
                    break;
                } catch (Exception e) {
                    System.out.print("Lutfen Sayi Giriniz : ");
                }
            }
            System.out.print("Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            switch (secim) {
                case 1:
                    miktarEkle(arananId);
                    break;
                case 2:
                    miktarEksilt(arananId);
                    break;
                case 3:
                    anaMenu();
                    break;
                default:
                    System.out.print("Hatali Giris Yaptiniz\n" +
                            "Ana Menuye Aktariyoruz Lutfen bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print("..");
                        try {
                            Thread.sleep(700);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    anaMenu();
                    break;
            }

        } else {
            System.out.println("Aradiginiz Urun Sistemde Kayitli Degil\n" +
                    "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
            for (int i = 0; i < 4; i++) {
                System.out.print("..");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
            }
            System.out.println();
            anaMenu();
        }
    }
    private static void miktarEksilt(int arananId) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cikis Yapmak Istediginiz Urunun Birimi : "
                + urunler.get(arananId).getBirim());
        System.out.print("Lutfen Cikis Yapmak Istediginiz Miktari Giriniz : ");
        int eksiltilecekMiktar;
        while (true) {
            try {
                eksiltilecekMiktar = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Girdiginiz Miktar Sayi Olmalidir\n" +
                        "Lutfen Tekrar Deneyiniz  : ");
            }
        }
        urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar() - eksiltilecekMiktar);
        System.out.print("Isleminiz Gerceklestiriliyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        System.out.println("Isleminiz Basari ile Gerceklestirildi");
        System.out.println("Guncel Miktar : " + urunler.get(arananId).getMiktar() + " " +
                urunler.get(arananId).getBirim());
        System.out.print("Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        anaMenu();

    }

    private static void miktarEkle(int arananId) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Miktar ekleme Yapmak Istediginiz Urun Birimi : "
                + urunler.get(arananId).getBirim());
        System.out.print("Lutfen Eklemek Istediginiz Miktari Giriniz : ");
        int eklenecekMiktar;
        while (true) {
            try {
                eklenecekMiktar = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Girdiginiz Miktar Sayi Olmalidir\n" +
                        "Lutfen Tekrar Deneyiniz  : ");
            }
        }
        urunler.get(arananId).setMiktar(eklenecekMiktar + urunler.get(arananId).getMiktar());
        System.out.print("Isleminiz Gerceklestiriliyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        System.out.println("Isleminiz Basari ıle Gerceklestirildi");
        System.out.println("Guncel Miktar : " + urunler.get(arananId).getMiktar() + " " +
                urunler.get(arananId).getBirim());
        System.out.print("Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        anaMenu();

    }

    private static void urunGiris() {
        Scanner scan = new Scanner(System.in);
        int Id = 100;
        while (true) {
            if (urunler.containsKey(Id)) {
                Id++;
            } else break;
        }
        System.out.print("Lutfen Urun Adini Giriniz : ");
        String urunAdi = scan.nextLine();

        System.out.print("Lutfen Uretici Giriniz : ");
        String uretici = scan.nextLine();

        System.out.print("Lutfen Urun Birimi Giriniz : ");
        String birim = scan.nextLine();

        int miktar;
        while (true) {
            try {
                System.out.print("Lutfen Urun Miktari Giriniz : ");
                miktar = Integer.parseInt(scan.next());
                break;

            } catch (Exception e) {
                System.out.print("Lutfen miktari Sayi Olarak Giriniz : ");
            }

        }
        System.out.print("Raf Bilgisi Giriniz : ");
        String raf = scan.next();

        Urunler urun = new Urunler(urunAdi, uretici, miktar, birim, raf);
        urunler.put(Id, urun);
        System.out.print("Isleminiz Gerceklestiriliyor Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        System.out.print("Isleminiz Basari Ile Gerceklestirildi\n" +
                "Ana Menuye Aktariyoruz Lutfen Bekleyiniz");
        for (int i = 0; i < 4; i++) {
            System.out.print("..");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        anaMenu();
    }

}
