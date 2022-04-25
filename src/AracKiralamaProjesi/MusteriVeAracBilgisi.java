package AracKiralamaProjesi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeAracBilgisi extends Arac{
    static List<Arac> aracTalepListesi=new ArrayList<Arac>();
    static int kiralanacakGunSayisi;

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******************ARAC KIRALAMA********************");
        System.out.println("*******************HOS GELDİNİZ********************");
        System.out.print("1-Arac Kiralama\n2-Cıkıs\nLutfen Seciminizi Yapiniz :  ");
        int sec = scan.nextInt();
        if (sec == 1) {
            System.out.println("Lutfen Bekleyiniz");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println();
            aracTalep();

        }else if(sec==2){
            System.out.println("Iyı gUnler Dileriz....");
        }else{
            System.out.println("Hatali Giris Tekrar Deneyiniz");
            menu();
        }
    }


        public static void aracTalep(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kiralamak istediginiz araci almak istediginiz sehri giriniz : ");
        String sehir=scan.nextLine();
        System.out.print("Teslim alacaginiz gunu giriniz  (Orn:26.04) :  ");
        String alisGun=scan.next();
        System.out.print("Teslim edeceginiz gunu giriniz (Orn:02.05) : ");
        String teslimGunu= scan.next();
        String aGun=alisGun.substring(0,2);
        int intAGun=Integer.parseInt(aGun);
        String aAy=alisGun.substring(3);
        int intAAy=Integer.parseInt(aAy);
        System.out.println("Alis Tarihi : "+intAAy+". ayin "+intAGun+". gunu");

        String tGun=teslimGunu.substring(0,2);
        int intTGun=Integer.parseInt(tGun);
        String tAy=teslimGunu.substring(3);
        int intTAy=Integer.parseInt(tAy);
        System.out.println("Teslim Tarihi : "+intTAy+". ayin "+intTGun+". gunu");

        if(intTAy==intAAy&&intTGun<intAGun){
            System.out.println("Alacaginiz gun teslim gununden sonra olamaz");
            System.out.println("Ana menuye yonlendiriliyorsunuz");
            for (int i = 0; i <3 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }

            }
            aracTalep();
        }else if(intAAy>intTAy){
            System.out.println("Alacaginiz gun teslim gununden sonra olamaz");
            System.out.println("Ana menuye yonlendiriliyorsunuz");
            for (int i = 0; i <5 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            aracTalep();
        }

        kiralanacakGunSayisi=(intTAy-intAAy)*30+(intTGun-intAGun);
        System.out.println("Arac Toplam "+kiralanacakGunSayisi+" gun kiralanmistir");
        System.out.println("Lutfen Bekleyiniz Arac Secim Menusune Yonlendiriliyorsunuz");
        for (int i = 0; i <3 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
            arabalar();

    }
     public static void arabalar(){
        Arac toyotaBenzinOtomatik=new Arac("Toyota",2020,"Benzin","Otomatik",250.0);
        Arac toyotaBenzinManuel=new Arac("Toyota",2020,"Benzin","Manuel",200.0);
        Arac toyotaDizelOtomatik=new Arac("Toyota",2022,"Dizel","Otomatik",350.0);
        Arac toyotaDizelManuel=new Arac("Toyota",2018,"Dizel","Manuel",185.0);

         Arac mercedesBenzinOtomatik=new Arac("Mercedes",2022,"Benzin","Otomatik",500.0);
         Arac mercedesBenzinManuel=new Arac("Mercedes",2020,"Benzin","Manuel",400.0);
         Arac mercedesDizelManuel=new Arac("Mercedes",2020,"Dizel","Manuel",445.0);
         Arac mercedesDizelOtomatik=new Arac("Mercedes",2019,"Dizel","Otomatik",385.0);

         Arac hondaDizelOtomatik=new Arac("Honda",2016,"Dizel","Otomatik",190.0);
         Arac hondaDizelManuel=new Arac("Honda",2020,"Dizel","Manuel",300.0);
         Arac hondaBenzinManuel=new Arac("Honda",2020,"Benzin","Manuel",300.0);
         Arac hondaBenzinOtomatik=new Arac("Honda",2022,"Benzin","Otomatik",400.0);

         aracTalepListesi.add(toyotaBenzinOtomatik);
         aracTalepListesi.add(toyotaBenzinManuel);
         aracTalepListesi.add(toyotaDizelOtomatik);
         aracTalepListesi.add(toyotaDizelManuel);
         aracTalepListesi.add(mercedesBenzinOtomatik);
         aracTalepListesi.add(mercedesBenzinManuel);
         aracTalepListesi.add(mercedesDizelOtomatik);
         aracTalepListesi.add(mercedesDizelManuel);
         aracTalepListesi.add(hondaBenzinOtomatik);
         aracTalepListesi.add(hondaBenzinManuel);
         aracTalepListesi.add(hondaDizelOtomatik);
         aracTalepListesi.add(hondaDizelManuel);
         Scanner scan=new Scanner(System.in);
         System.out.println("**************Arac Secim Menusu*****************");
         System.out.print("1-Toyota Benzin Otomatik\n2-Toyota Benzin Manuel\n" +
                 "3-Toyota Dizel Otomatik\n4-Toyota Dizel Manuel\n" +
                 "5-Mecedes Benzin Otomatik\n6-Mecedes Benzin Manuel\n" +
                 "7-Mecedes Dizel Otomatik\n8-Mecedes Dizel Manuel\n" +
                 "9-Honda Benzin Otomatik\n10-Honda Benzin  Manuel\n" +
                 "11-Honda Dizel Otomatik\n12-Honda Dizel Manuel\n" +
                 "Lutfen tercihinizi yapiniz : ");
         int aracSecim=scan.nextInt();
         System.out.println("Arac araniyor lutfen bekleyiniz");
         System.out.println();

         for (int i = 0; i <5 ; i++) {
             System.out.print(".");
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
             }

         }
         switch(aracSecim){

             case 1:
                 aracTalepListesi.get(0);
                 break;
             case 2:
                 aracTalepListesi.get(1);
                 break;
             case 3:
                 aracTalepListesi.get(2);
                 break;
             case 4:
                 aracTalepListesi.get(3);
                 break;
             case 5:
                 aracTalepListesi.get(4);
                 break;
             case 6:
                 aracTalepListesi.get(5);
                 break;
             case 7:
                 aracTalepListesi.get(6);
                 break;
             case 8:
                 aracTalepListesi.get(7);
                 break;
             case 9:
                 aracTalepListesi.get(8);
                 break;
             case 10:
                 aracTalepListesi.get(9);
                 break;
             case 11:
                 aracTalepListesi.get(10);
                 break;
             case 12:
                 aracTalepListesi.get(11);
                 break;
             default:
                 System.out.println("Hatali Giris ");
                 System.out.println("Arac Secim Menusune Yonlendiriliyorsunuz Lutfen Bekleyiniz");
                 System.out.println();
                 for (int i = 0; i <3 ; i++) {
                     System.out.print(".");
                     try {
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                     }

                 }
                 arabalar();

         }

      getAraba(aracSecim,kiralanacakGunSayisi);

     }

    private static void getAraba(int aracSecim, int kiralanacakGunSayisi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sectiginiz Arac : "+aracTalepListesi.get(aracSecim-1));
        System.out.println("Odemeniz Gereken Tutar :"+kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret());
        System.out.print("Onayliyorsaniz  :   1\nOnaylamiyarsaniz  : 2\nBasiniz : ");
        int onay=scan.nextInt();
        if(onay==1){
            System.out.println("Odeme Sayfasina Aktariliyorsunuz Lutfen Bekleyiniz");
            System.out.println();
            for (int i = 0; i <4 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            odemeler(aracSecim);
        }else{
            System.out.println("Ana Menuye Aktariliyorsunuz Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            menu();
        }

    }

    private static void odemeler(int aracSecim) {
        Scanner scan = new Scanner(System.in);
        System.out.println("************Odemeler Menusu***************");
        System.out.print("1-Nakit\n2-Kredi Karti\n3-Ana Menu\nLutfen Odeme Yapmak istediginiz Secenegi Seciniz : ");
        double odeme=scan.nextDouble();

        if(odeme==1){
            System.out.println("Odeyeceginiz Tutar : "+kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret());
            System.out.print("Nakit Tutarini Giriniz : ");
            double nakit= scan.nextDouble();
            System.out.println("Yatirdiginiz Tutar Hesaplaniyor Lutfen Bekleyiniz");
            System.out.println();
            for (int i = 0; i <4 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println();

            if(nakit>(kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret())){
                System.out.println("Yatirdiginiz Tutar : "+nakit);
                System.out.println("Odemeniz Yapiliyor Lutfen Bekleyiniz");
                System.out.println();
                for (int i = 0; i <4 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println();

                System.out.println("Para Ustu : "+(nakit-(kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret())));
                System.out.println("Lutfen Paranizi Aliniz");
                System.out.println("Iyı Gunler....");
            }else if(nakit==(kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret())){
                System.out.println("Yatirdiginiz Tutar : "+nakit);
                System.out.println("Odemeniz Yapiliyor Lutfen Bekleyiniz");
                System.out.println();
                for (int i = 0; i <4 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println();
                System.out.println("Odeme Gerceklesti");
                System.out.println("Iyı Gunler....");

            }else if(nakit<(kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret())){
                System.out.println("Yatirdiginiz Tutar  : "+((kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret())
                -nakit)+" Tl eksik");
                System.out.println("Lutfen Tekrar Deneyiniz");
                System.out.println("Odemeler Menusune Aktariliyorsunuz Lutfen Bekleyiniz");
                for (int i = 0; i <4 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                odemeler(aracSecim);

            }

        }else if(odeme==2){
            System.out.println("Odeyeceginiz Tutar : "+kiralanacakGunSayisi*aracTalepListesi.get(aracSecim-1).getGunlukUcret());
            System.out.print("Lutfen 16 haneli Kredi Karti Numaranizi Giriniz :  ");
            String kKNo=scan.next();
            if(kKNo.length()==16){
                System.out.print("Lutfen Sirenizi Giriniz : ");
                String sifre=scan.next();
                System.out.println("Odemeniz Gerceklesiyor Lutfen Bekleyiniz");
                for (int i = 0; i <4 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println();
                System.out.println("Odemeniz Gerceklesti");
                System.out.println("Iyı Gunler Dileriz.....");
            }else{
                System.out.println("Girdiginiz Kredi Karti No Gecersiz");
                System.out.println("Lutfen Tekrar Deneyiniz");
                System.out.println("Odemeler Menusune Aktariliyorsunuz Lutfen Bekleyiniz");
                for (int i = 0; i <4 ; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                odemeler(aracSecim);

            }

        }else if(odeme==3){
            System.out.println("Ana Menuye Aktariliyorsunuz Lutfe Bekleyiniz ");
            for (int i = 0; i <4 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            menu();

        }else{
            System.out.println("Hatali Giris Yaptiniz");
            System.out.println("Odemeler Menusune Aktariliyorsunuz Lutfen Bekleyiniz");
            for (int i = 0; i <4 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            odemeler(aracSecim);
        }
    }


}
