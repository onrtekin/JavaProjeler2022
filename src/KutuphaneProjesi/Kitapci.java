package KutuphaneProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
    public static int kitapNo=100;

    public static void main(String[] args) {
        List<Kitap> kitapListesi=new ArrayList<Kitap>();

     Kitap kitap1=new Kitap(++kitapNo,"Isyan Ahlaki","Nurettin Topcu",1945,52.0);
     Kitap kitap2=new Kitap(++kitapNo,"Turkiyenin Maarif Davasi","Nurettin Topcu",1960,30.0);
     Kitap kitap3=new Kitap(++kitapNo,"Icimizdeki Seytan","Sebahattin Ali",1935,36.0);
     Kitap kitap4=new Kitap(++kitapNo,"Kuyucakli Yusuf","Sebahattin Ali",1930,30.0);
     Kitap kitap5=new Kitap(++kitapNo,"Safahat","Mehmet Akif Ersoy",1920,50.0);
     kitapListesi.add(kitap1);
     kitapListesi.add(kitap2);
     kitapListesi.add(kitap3);
     kitapListesi.add(kitap4);
     kitapListesi.add(kitap5);

     anaMenu(kitapListesi);

    }

    private static void anaMenu(List<Kitap> kitapListesi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("************Hos Geldiniz************");
        System.out.println("1=Kitap Ekle\n2=Numara ile Kitap Sil\n3=Tum Kitaplari Listele" +
                "\n4=Cikis\n");
        System.out.print("Lütfen seciminizi giriniz : ");
        int tercih=scan.nextInt();

        switch(tercih){

            case 1:
                kitapEkle(kitapListesi);

                break;

            case 2:
                numaraİleKitapSil(kitapListesi);

                break;
            case 3:
                tumKitaplariListele(kitapListesi);

                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Hatali Giris Lutfen tekrar deneyiniz ");
                anaMenu(kitapListesi);
        }
    }

    private static void kitapEkle(List<Kitap> kitapListesi) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kitap Adi Giriniz : ");
        String kitapAdi=scan.nextLine();
        System.out.print("Yazar Adi Giriniz : ");
        String yazarAdi=scan.nextLine();
        System.out.print("Yayin Yili Giriniz : ");
        int yayinYili= scan.nextInt();
        System.out.print("Fiyat Giriniz : ");
        double fiyat= scan.nextDouble();
        Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);
        kitapListesi.add(kitap);
        System.out.println(kitap.toString()+" eklendi");
        anaMenu(kitapListesi);

    }

    private static void tumKitaplariListele(List<Kitap> kitapListesi) {
        for (Kitap each:kitapListesi) {
            System.out.println(each.toString());
        }
        anaMenu(kitapListesi);

    }

    private static void numaraİleKitapSil(List<Kitap> kitapListesi) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Silmek istediginiz kitabin numarasini giriniz : ");
        int numara= scan.nextInt();
        for (Kitap each:kitapListesi) {
            if(each.getNo()==numara){
                System.out.println(each.toString()+" silindi");
                kitapListesi.remove(each);
                anaMenu(kitapListesi);
            }
        }
        System.out.println(numara+" numarali kitap bulunamadi");
    anaMenu(kitapListesi);
    }


    private static void cikis() {
        System.out.println("Iyı Gunler....");
    }

}
