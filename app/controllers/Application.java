package controllers;

import play.Logger;
import play.data.validation.Required;
import play.libs.Codec;
import play.mvc.*;

import java.time.Instant;
import java.util.*;

import models.*;
import services.ArticleService;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        List<Article> articles = ArticleService.get().findAllArticles();
        render(articles);
    }

    public static void submitArticle(@Required Article article){
        article.uuid= Codec.UUID();
        article.date=Date.from(Instant.now());
        ArticleService.get().addArticle(article);
        Application.index();
    }

    public static void detail(@Required String uuid){
        Article article = ArticleService.get().findArticleByUUID(uuid);
        render(article);
    }

    public static void submitCommentaire(@Required String uuid, @Required String auteur, @Required String content){
        Article article = ArticleService.get().findArticleByUUID(uuid);
        article.addCommentaire(new Commentaire(auteur,content));
        Application.detail(uuid);
    }

}