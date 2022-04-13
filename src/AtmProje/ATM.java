package AtmProje;


    import java.util.Scanner;

    public class ATM<islemler> {
        public void calistir(Hesap hsp) {
            Giris giris = new Giris();
            int girisHakki = 3;
            System.out.println("****** HOSGELDİNİZ ********");
            while (true) {
                if (giris.Giris(hsp)) {
                    System.out.println("Giris Basarili");
                    break;
                } else {
                    System.out.println("Giris Basarisiz");
                    girisHakki--;
                    System.out.println(girisHakki + " hakiniz kaldi");
                }
                if (girisHakki == 0) {
                    System.out.println("Giris Hakkiniz Bitti...");
                    return;
                }
            }
            menu(hsp);

        }

        private void menu(Hesap hsp) {
            System.out.println("***** Lutfen Isleminizi Seciniz *****\n1-Bakiye Sorma\n" +
                    "2-Para Yatirma\n3-Para Cekme\n4-Cikis");

            while (true) {
                Scanner scan = new Scanner(System.in);
                String islem = scan.next();
                switch (islem) {

                    case "1":
                        System.out.println("Bakiyeniz : " + hsp.getBakiye());
                        menu(hsp);
                    case "2":
                        System.out.print("Yatirmak İstediginiz Miktari Giriniz : ");
                        int yatTutar= scan.nextInt();
                        hsp.paraYatir(yatTutar);
                        menu(hsp);
                    case "3":
                        System.out.print("Lutfen Cekeceginiz Tutari Giriniz : ");
                        int cekTutar=scan.nextInt();
                        hsp.paraCek(cekTutar);
                        menu(hsp);
                    case "4":
                        System.out.println("Iyı Gunler Dileriz...");
                        break;
                    default:
                        try {
                            System.out.println("Hatali Giris");
                            menu(hsp);
                        } catch (Exception e) {
                        }
                        break;

                }
            }
        }
    }

