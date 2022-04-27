package TasKagitMakasOyunu;

import java.util.Scanner;

public class TasKagitMakas {
    static Scanner scan = new Scanner(System.in);

    public static void oyunaBasla() {

        int kullaniciPuani = 0;
        int bilgisayarPuani = 0;

        System.out.println("*****Tas Kagit Makas Oyunu Basliyor*****");
        System.out.println("*********Puani 3 Olan Kazanir***********");
        System.out.println("Yukleniyor");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();
        devam(kullaniciPuani, bilgisayarPuani);
    }

    private static void devam(int kullaniciPuani, int bilgisayarPuani) {
        boolean devam=true;
        while (true) {
            System.out.print("1-Tas\n2-Kagit\n3-Makas\nLutfen Seciminizi Giriniz : ");
            int kullaniciSecim = scan.nextInt();
            int bilgisayarinSecimi = (int) (Math.random() * 3+1);
            if (kullaniciSecim == 1) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Tas");
                    System.out.println("Bilgisayrin Secimi : " + "Tas");
                    System.out.println("Sonuc              : Berabere");
                    System.out.println("**********Puan Durumu**********         \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani : " + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Tas");
                    System.out.println("Bilgisayrin Secimi : " + "Kagit");
                    System.out.println("Sonuc              : Bigisayar Kazandi");
                    bilgisayarPuani++;
                    System.out.println("**********Puan Durumu********** \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Tas");
                    System.out.println("Bilgisayrin Secimi : " + "Makas");
                    System.out.println("Sonuc              : Tebrikler Siz Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("**********Puan Durumu********** \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                }

            } else if (kullaniciSecim == 2) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Kagit");
                    System.out.println("Bilgisayrin Secimi : " + "Tas");
                    System.out.println("Sonuc              : Tebrikler Siz Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("**********Puan Durumu**********\nKullanici : " + kullaniciPuani + "\nBilgisayar Puani : " + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Kagit");
                    System.out.println("Bilgisayrin Secimi : " + "Kagit");
                    System.out.println("Sonuc              : Berabere");

                    System.out.println("**********Puan Durumu**********\nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Kagit");
                    System.out.println("Bilgisayrin Secimi : " + "Makas");
                    System.out.println("Sonuc              : Malesef Kaybettiniz");
                    bilgisayarPuani++;
                    System.out.println("**********Puan Durumu********** \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                }


            } else if (kullaniciSecim == 3) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Makas");
                    System.out.println("Bilgisayrin Secimi : " + "Tas");
                    System.out.println("Sonuc              : Malesef Kaybettiniz");
                    bilgisayarPuani++;
                    System.out.println("**********Puan Durumu********** \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani : " + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Makas");
                    System.out.println("Bilgisayrin Secimi : " + "Kagit");
                    System.out.println("Sonuc              : Tebrikler Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("**********Puan Durumu********** \nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                } else {
                    System.out.println("Sonuclar Yazdiriliyor");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();
                    System.out.println("Sizin Seciminiz    : " + "Makas");
                    System.out.println("Bilgisayrin Secimi : " + "Makas");
                    System.out.println("Sonuc              : Berabere");
                    System.out.println("**********Puan Durumu**********\nKullanici : " + kullaniciPuani + "\nBilgisayar Puani :" + bilgisayarPuani);
                    System.out.println("*******************************");
                    System.out.println("Puanlar Kontrol Ediliyor Lutfen Bekleyiniz");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    System.out.println();

                }
            } else {
                System.out.println("Hatali Giris Yaptiniz");
                System.out.println("Yeni Oyun Basliyor Lutfen Bekleyiniz");
                for (int i = 0; i < 4; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println();

            }

            if (kullaniciPuani == 3) {

                System.out.println();
                System.out.println("Sizin Puaniniz   : " + kullaniciPuani);
                System.out.println("Bilgisayar Puani : " + bilgisayarPuani);
                System.out.println("*******TEBRİKLER SIZ KAZANDİNİZ***********");
                devam=false;
                break;
            } else if (bilgisayarPuani == 3) {

                System.out.println();
                System.out.println("Sizin Puaniniz   : " + kullaniciPuani);
                System.out.println("Bilgisayar Puani : " + bilgisayarPuani);
                System.out.println("*******MALESEF KAYBETTİNİZ***********");
                devam=false;
                break;
            }

        }

    }

}

