package controllers;


import models.Utilisateur;
import services.UtilisateurServices;

public class Security extends Secure.Security {
    static boolean authenticate(String username, String password){
        Utilisateur utilisateur = UtilisateurServices.get().findUtilisateurByUsername(username);
        return (utilisateur!=null)&&utilisateur.password.equals(password);
    }
}
