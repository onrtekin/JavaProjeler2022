package AtmProje;

    public class Hesap {
        private String kullanici;
        private String sifre;
        private double bakiye;
        Hesap(){

        }

        public Hesap(String kullanici, String sifre, double bakiye) {
            this.kullanici = kullanici;
            this.sifre = sifre;
            this.bakiye = bakiye;
        }

        public String getKullanici() {
            return kullanici;
        }

        public void setKullanici(String kullanici) {
            this.kullanici = kullanici;
        }

        public String getSifre() {
            return sifre;
        }

        public void setSifre(String sifre) {
            this.sifre = sifre;
        }

        public double getBakiye() {
            return bakiye;
        }

        public void setBakiye(double bakiye) {
            this.bakiye = bakiye;
        }
        public void paraCek(int tutar){
            if(bakiye-tutar<0){
                System.out.println("Yetersiz Bakiye ");
            }else{
                bakiye-=tutar;
                System.out.println("Bakiye : "+bakiye);
            }

        }
        public void paraYatir(int tutar){
            bakiye+=tutar;
            System.out.println("Bakiyeniz : "+bakiye);
        }
    }

