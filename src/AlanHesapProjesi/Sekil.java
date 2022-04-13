package AlanHesapProjesi;

public  class Sekil {
    private String isim;
    Sekil(){


    }

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void nedir(){
        System.out.println("Bu obje "+isim+" objesidir");
    }
    public void alanHesapla(){

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
