package models;

import play.libs.Codec;

public class Utilisateur {
    public String uuid;
    public String username;
    public String password;

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
        this.uuid = Codec.UUID();
    }
}
