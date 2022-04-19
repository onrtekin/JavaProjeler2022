package HastaneProje;
import java.util.Scanner;
public class HastaneRunner {
    private static Hastane hastane = new Hastane();
    private static String aktüelDurum;


    public static void main(String[] args) {

        giris();
        hastaDurumuBul(aktüelDurum);
        hastaBul(aktüelDurum);


    }

    public static void giris() {
        Hasta hasta = new Hasta();
        Scanner scanner = new Scanner(System.in);
        System.out.print("adinizi giriniz : ");
        hasta.setIsim(scanner.next());
        System.out.print("soyadinizi giriniz : ");
        hasta.setSoyIsim(scanner.next());

        System.out.print("Lutfen  hastaliginizi giriniz\nAllerrji:1\nBas agrisi:2\nDiabet:3\nSoguk alginligi:4\nMigren:5\nKalp hastaliklari:6\nSeciminiz:");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                aktüelDurum = "Allerji";
                break;
            case 2:
                aktüelDurum = "Bas agrisi";
                break;
            case 3:
                aktüelDurum = "Diabet";
                break;
            case 4:
                aktüelDurum = "Soguk alginligi";
                break;
            case 5:
                aktüelDurum = "Migren";
                break;
            case 6:
                aktüelDurum = "Kalp hastaliklari";
                break;
            default:
                System.out.println(" yanlis secim lütfen tekrar deneyiniz");
                giris();
                break;
        }
        String unvan=doktorUnvan(aktüelDurum);
        Doktor doktor=doktorBul(unvan);
        System.out.println("Doktorunuz "+unvan+ " bölümünden "+ doktor.toString()+ "dur.");
    }
    public static Durum hastaDurumuBul(String aktüelDurum) {
        Durum hastaDurumu = new Durum();
        hastaDurumu.setAktüelDurum(aktüelDurum);
        return hastaDurumu;
    }
    public static Hasta hastaBul(String aktüelDurum) {
        Hasta hasta = new Hasta();
        return hasta;
    }

    public static String doktorUnvan(String aktüelDurum) {

        if (aktüelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];
        } else if (aktüelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (aktüelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];
        } else if (aktüelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        } else if (aktüelDurum.equals("Migren")) {
            return hastane.unvanlar[4];
        } else if (aktüelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }
        return "yanlis durum";
    }
    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }
        }
        return doktor;
    }
}
