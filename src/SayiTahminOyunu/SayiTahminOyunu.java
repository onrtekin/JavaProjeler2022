package SayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(10);
        Scanner scan = new Scanner(System.in);
        int tahminSayisi=3;

        while(tahminSayisi>0){
            System.out.print("0- 10 arasi bir sayi tahmin ediniz   : ");
            int tahmin=scan.nextInt();
            if(tahmin==sayi){
                System.out.println("Tahmin ettiginiz sayi : "+sayi+" tebrikler bildiniz... ");
                break;
            }else{
                System.out.println("yanlis cevap kalan hakkiniz : "+(tahminSayisi-1));

            }
            tahminSayisi--;
            if(tahminSayisi==0) System.out.println("tahmin hakkiniz bitti kaybettiniz aradiginiz sayi : "+sayi);


        }

    }
}
