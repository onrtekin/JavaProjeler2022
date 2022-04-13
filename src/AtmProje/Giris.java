package AtmProje;


    import java.util.Scanner;

    public class Giris {
        public boolean Giris(Hesap hsp){
            String kulaniciAdi;
            String sifre;
            Scanner scan=new Scanner(System.in);
            System.out.print("Lutfen Kullanici Adini Giriniz : ");
            kulaniciAdi=scan.nextLine();
            System.out.print("Lutfen Sifrenizi Giriniz : ");
            sifre=scan.next();
            if(hsp.getKullanici().equalsIgnoreCase(kulaniciAdi)&&hsp.getSifre().equals(sifre)){
                return true;
            }else{
                return false;
            }
        }
    }

