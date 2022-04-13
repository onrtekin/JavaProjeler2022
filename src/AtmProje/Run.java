package AtmProje;


    public class Run {
        public static void main(String[] args) {
            ATM obj = new ATM();
            Hesap hsp=new Hesap("omer","12345",5000);
            obj.calistir(hsp);
            System.out.println("Cikis");
        }
    }

