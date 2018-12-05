package services;

import models.Utilisateur;
import play.Logger;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurServices {
    public static UtilisateurServices instance;
    private UtilisateurServices(){
        utilisateurs = new ArrayList<>();
    }
    public static UtilisateurServices get(){
        if (instance==null){
            instance = new UtilisateurServices();
        }
        return instance;
    }
    private List<Utilisateur> utilisateurs;
    public void addUtilisateur(Utilisateur utilisateur){
        utilisateurs.add(utilisateur);
    }
    public List<Utilisateur> findAllUtilisateurs(){
        return utilisateurs;
    }
    public Utilisateur findUtilisateurByUsername(String username){
        Logger.error("Utilisateurs.size : "+String.valueOf(utilisateurs.size()));
        for (Utilisateur utilisateur:utilisateurs){
            Logger.error("Username : " + utilisateur.username + " ; password : "+utilisateur.password
            );
            if(utilisateur.username.equals(username)){
                return utilisateur;
            }
        }
        return null;
    }
}
