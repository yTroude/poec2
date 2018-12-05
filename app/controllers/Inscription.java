package controllers;

import models.Utilisateur;
import play.data.validation.Required;
import play.mvc.Controller;
import services.UtilisateurServices;

public class Inscription extends Controller {
    public static void inscription(){
        render();
    }
    public static void createUtilisateur(@Required String username, @Required String password){
        UtilisateurServices.get().addUtilisateur(new Utilisateur(username, password));
        Application.index();
    }
}
