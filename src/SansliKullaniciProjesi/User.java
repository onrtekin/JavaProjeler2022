package SansliKullaniciProjesi;

import java.time.LocalDateTime;

public class User {
     String name;
    LocalDateTime kayitZamani;

    User(){


    }

    public User(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
