package models;

import play.libs.Codec;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {
    public String uuid;
    public String titre;
    public String auteur;
    public String content;
    public Date date;
    public List<Commentaire> commentaires;

    public void addCommentaire(Commentaire commentaire){
        commentaires.add(commentaire);
    }

    public List<Commentaire> getCommentaires(){
        return commentaires;
    }

}
