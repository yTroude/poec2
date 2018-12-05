package services;

import models.Article;
import play.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {
    public static ArticleService instance;
    private ArticleService(){
        articles = new ArrayList<Article>();
    }
    public static ArticleService get(){
        if (instance==null){
            instance = new ArticleService();
        }
        return instance;
    }
    private List<Article> articles;
    public void addArticle(Article article){
        articles.add(article);
    }
    public List<Article> findAllArticles(){
        return articles;
    }
    public Article findArticleByUUID(String uuid){
        Logger.debug(uuid);
        for (Article article:articles){
            if(article.uuid.equals(uuid)){
                return article;
            }
        }
        return null;
    }
}
