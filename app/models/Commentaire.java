package models;

import play.libs.Codec;

import java.time.Instant;
import java.util.Date;

public class Commentaire {
    public String uuid;
    public String auteur;
    public Date date;
    public String content;

    public Commentaire(String auteur, String content) {
        this.uuid = Codec.UUID();
        this.auteur = auteur;
        this.content = content;
        this.date=Date.from(Instant.now());
    }
}
